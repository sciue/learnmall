package com.sciue.learnmall.mbg;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DeflaterInputStream;

public class Generator {
    public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {

        // mbg执行过程中的警告消息
        List<String> warnings = new ArrayList<String>();

        // 生成代码若重复则覆盖
        boolean overwrite = true;

        // 读取配置的mbg文件
        InputStream is = Generator.class.getResourceAsStream("/generatorConfig.xml");
        ConfigurationParser configurationParser = new ConfigurationParser(warnings);
        Configuration configuration = configurationParser.parseConfiguration(is);
        is.close();

        DefaultShellCallback defaultShellCallback = new DefaultShellCallback(overwrite);
        // 创建MBG
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(configuration, defaultShellCallback, warnings);

        // 执行生成代码
        myBatisGenerator.generate(null);

        // 输出警告消息
        for(String warning : warnings){
            System.out.println(warning);
        }

    }
}

package cn.edu.cqut.util;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * <p>
 * 代码生成器演示
 * </p>
 * @author Glorious
 */
public class MpGenerator {
 
    public static void main(String[] args) {
//        assert (false) : "代码生成属于危险操作，请确定配置后取消断言执行代码生成！";
        AutoGenerator mpg = new AutoGenerator();
 
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setAuthor("Glorious");
        gc.setServiceName("%service");
        gc.setMapperName("%dao");
        gc.setSwagger2(true);
        //对应项目的src/main/java目录在磁盘上的真实路径
        gc.setOutputDir("D:\\IdeaProjects\\-JobKnowledge/src/main/java");
        // 是否覆盖同名文件，默认是false
        gc.setFileOverride(false);
        // 不需要ActiveRecord特性的请改为false
        gc.setActiveRecord(true);
        // XML 二级缓存
        gc.setEnableCache(false);
        // XML ResultMap
        gc.setBaseResultMap(true);
        // XML columList
        gc.setBaseColumnList(false);
        mpg.setGlobalConfig(gc);
 
        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        dsc.setUrl("jdbc:mysql://localhost:3306/cqcrm?useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Shanghai");
        mpg.setDataSource(dsc);
 
        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        // 需要生成的表
        strategy.setInclude("contact");
        mpg.setStrategy(strategy);
 
        // 包配置
        PackageConfig pc = new PackageConfig();
        //项目的根包（启动类所在的包）
        pc.setParent("cn.edu.cqut");
        //Controller类所在的包
        pc.setController("controller");
        //Service接口所在的包
        pc.setService("service");
        //Service实现类所在的包
        pc.setServiceImpl("service.impl");
        //Mapper接口所在的包
        pc.setMapper("dao");
        //实体类所在的包
        pc.setEntity("entity");
        //mapper映射文件所在的包
        pc.setXml("mapper.xml");
        mpg.setPackageInfo(pc);
 
        TemplateConfig tc = new TemplateConfig();
        //不生成xml映射文件
        tc.setXml(null);
        mpg.setTemplate(tc);
 
        // 执行生成
        mpg.execute();
 
    }
}

package cn.edu.cqut.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <h3>crmservice</h3>
 * <p></p>
 *
 * @author : Glorious
 * @date : 2020-06-05 17:42
 **/
@Configuration
public class PaginationInterceptorConfiguration {
	/**
	 * 注入MyBatis的分页插件
	 * @return paginationInterceptor
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		return new PaginationInterceptor();
	}
}

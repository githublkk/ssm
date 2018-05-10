/**   
 * @Title: SwaggerConfig.java 
 * @Package com.cp.swagger 
 * @Description: swagger配置
 * @author sndu   
 * @date 2017年11月29日 下午3:33:40 
 * @version V1.0   
*/
package ssm.chengpai.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableWebMvc
@EnableSwagger2
@ComponentScan("ssm.chengpai.*")
public class SwaggerConfig {
	@Bean
	public Docket customDocket() {
		//
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().paths(PathSelectors.ant("/*/**"))
				.build();

	}

	private ApiInfo apiInfo() {

		ApiInfo apiInfo = new ApiInfo("公寓管理", "橙派科技开放API Create By 卢凯", "1.0", "4", "1650754224@qq.com",
				"Apache License 2.0", "www.chengpaikeji.com");
		return apiInfo;
	}

}

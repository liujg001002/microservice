package atguigu.springcloud.cfgbeans;

import com.atguigu.myrule.RandomRule_ZY;
import com.netflix.loadbalancer.IRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean //boot -->spring   applicationContext.xml --- @Configuration配置   ConfigBean = applicationContext.xml
{ 
	@Bean
	@LoadBalanced//Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

	@Bean
	public IRule myRule(){
		//return new RandomRule();//使用随机替代默认轮询算法
		return new RandomRule_ZY();
	}
}
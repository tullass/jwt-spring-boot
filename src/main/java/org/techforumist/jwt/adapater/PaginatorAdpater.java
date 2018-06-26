package org.techforumist.jwt.adapater;

import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import java.util.List;

@Configuration
public class PaginatorAdpater extends WebMvcConfigurerAdapter {

	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
		PageableHandlerMethodArgumentResolver phmar = new PageableHandlerMethodArgumentResolver();

		int page = 0;
		int size = 9000;
		phmar.setFallbackPageable(new PageRequest(page, size));
		argumentResolvers.add(phmar);
	}
}

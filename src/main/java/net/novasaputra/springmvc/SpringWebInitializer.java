package net.novasaputra.springmvc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import net.novasaputra.springmvc.config.SpringConfig;
import net.novasaputra.springmvc.config.SpringMvcConfig;

/**
 * @author novas
 */
public class SpringWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{SpringConfig.class};
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{SpringMvcConfig.class};
	}
	
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
}

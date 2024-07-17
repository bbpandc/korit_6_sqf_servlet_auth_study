package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

// /*: 모든 tomcat과 servlet사이에 필터 적용
//@WebFilter("/*")
@WebFilter(filterName = "encodingFilter")
public class EncodingFilter extends HttpFilter implements Filter {
       
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// 전처리
		System.out.println("전처리");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		chain.doFilter(request, response); 	// 다음필터 또는 서블릿 호출
		// 후처리
		System.out.println("후처리");
	}

	

}

package ravi.hobby.project.CuisineDiaryApi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.util.ContentCachingResponseWrapper;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoggingFilter implements Filter {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingFilter.class);

    @Override
    public void init(FilterConfig filterConfig) {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper((HttpServletResponse) response);
        try {
            chain.doFilter(request, responseWrapper);
        } finally {
            LOGGER.info("Response ::{}", new String(responseWrapper.getContentAsByteArray()));
            // Do not remove this line after reading response content or actual
            // response will be empty!
            responseWrapper.copyBodyToResponse();
        }

    }
}
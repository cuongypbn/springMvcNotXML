package vn.cmctelecom.springmvcweb.config;

import com.sun.faces.config.ConfigureListener;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebMvcConfigure.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/*"};
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.setInitParameter("javax.faces.DEFAULT_SUFFIX", ".xhtml");
        servletContext.setInitParameter("javax.faces.DEFAULT_SUFFIX",
                ".xhtml");
        servletContext.setInitParameter(
                "javax.faces.PARTIAL_STATE_SAVING_METHOD", "true");
        servletContext.setInitParameter("javax.faces.PROJECT_STAGE",
                "Development");
        servletContext.setInitParameter("facelets.DEVELOPMENT", "true");
        servletContext.setInitParameter("javax.faces.FACELETS_REFRESH_PERIOD", "1");
        // Enable special Facelets debug output during development
//        servletContext.setInitParameter("javax.faces.PROJECT_STAGE", "Development");
//        // Causes Facelets to refresh templates during development
//        servletContext.setInitParameter("javax.faces.FACELETS_REFRESH_PERIOD", "1");
//        // Declare Spring Security Facelets tag library
//        servletContext.setInitParameter("javax.faces.FACELETS_LIBRARIES",
//                "/WEB-INF/springsecurity.taglib.xml");

        servletContext.addListener(ConfigureListener.class);
        super.onStartup(servletContext);
    }
}

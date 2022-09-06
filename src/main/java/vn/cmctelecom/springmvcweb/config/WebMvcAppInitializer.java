package vn.cmctelecom.springmvcweb.config;

import com.sun.faces.config.FacesInitializer;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;


public class WebMvcAppInitializer extends FacesInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) {
        System.out.println("WebMvcAppInitializer.onStartup()");
        servletContext.setInitParameter("javax.faces.FACELETS_SKIP_COMMENTS", "true");
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
        servletContext.setInitParameter("javax.faces.PROJECT_STAGE", "Development");

        final AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();
        root.scan("vn.cmctelecom.springmvcweb");
        root.register(WebMvcConfigure.class);
        servletContext.addListener(new ContextLoaderListener(root));
        ServletRegistration.Dynamic appServlet =
                servletContext.addServlet("mvc", new DispatcherServlet(new GenericWebApplicationContext()));
        appServlet.setLoadOnStartup(1);
        appServlet.addMapping("/*");
    }
}

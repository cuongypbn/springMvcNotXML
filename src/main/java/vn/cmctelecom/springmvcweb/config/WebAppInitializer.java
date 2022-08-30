//package vn.cmctelecom.springmvcweb.config;
//
//import com.sun.faces.config.FacesInitializer;
//import com.sun.org.apache.bcel.internal.util.ClassPath;
//import org.springframework.web.WebApplicationInitializer;
//
//import org.springframework.web.context.ContextLoaderListener;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
//import javax.faces.webapp.FacesServlet;
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;
//import java.util.Collections;
//import java.util.HashSet;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//public class WebAppInitializer extends FacesInitializer implements WebApplicationInitializer {
//    @Override
//    public void onStartup(ServletContext container) throws ServletException {
////        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
////        ctx.register(WebMvcConfigure.class);
////        container.addListener(new ContextLoaderListener(ctx));
//        FacesInitializer facesInitializer = new FacesInitializer();
//        Set<Class<?>> clazz = new HashSet<>();
//        clazz.add(WebMvcConfigure.class);
//        facesInitializer.onStartup(clazz, container);
//        container.setInitParameter("javax.faces.DEFAULT_SUFFIX",
//                ".xhtml");
//        container.setInitParameter(
//                "javax.faces.PARTIAL_STATE_SAVING_METHOD", "true");
//        container.setInitParameter("javax.faces.PROJECT_STAGE",
//                "Development");
//        container.setInitParameter("facelets.DEVELOPMENT", "true");
//        container.setInitParameter("javax.faces.FACELETS_REFRESH_PERIOD", "1");
//        ServletRegistration.Dynamic registration = container.addServlet("dispatcher",  FacesServlet.class);
//        registration.setLoadOnStartup(1);
//        registration.addMapping("*.xhtml");
//    }
//
//
//}

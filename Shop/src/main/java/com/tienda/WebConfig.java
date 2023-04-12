//
//package com.tienda;
//
//import java.util.Locale;
//import lombok.experimental.var;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
//import org.springframework.web.servlet.i18n.SessionLocaleResolver;
//
//
//public class WebConfig implements WebMvcConfigurer {
//    @Bean
//    public SessionLocaleResolver localeResolver(){
//        var slr=(var) new SessionLocaleResolver();
//        slr.setDefaulLocale(new Locale("es"));
//        return slr;
//    }
//    @Bean
//    public LocaleChangeInterceptor localeChangeInterceptor(){
//        var lci =new LocaleChangeInterceptor());
//        lci.setParamName("lang");
//        return lci;
//        
//    }
//    @Override
//    public void addInterceptors(InterceptorRegistry registro){
//        registro.addInterceptor
//    }
//}

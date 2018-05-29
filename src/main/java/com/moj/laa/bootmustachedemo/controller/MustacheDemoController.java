package com.moj.laa.bootmustachedemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller

public class MustacheDemoController {

    @Value("${topOfPage}")
    private String topOfPage;

    @Value("${htmlLang}")
    private String htmlLang;

    @Value("${pageTitle}")
    private String pageTitle;

    @Value("${head}")
    private String head;

    @Value("${assetPath}")
    private String assetPath;

    @Value("${bodyStart}")
    private String bodyStart;

    @Value("${skipLinkMessage}")
    private String skipLinkMessage;

    @Value("${globalHeaderText}")
    private String globalHeaderText;

    @Value("${insideHeader}")
    private String insideHeader;

    @Value("${propositionHeader}")
    private String propositionHeader;

    @Value("${cookieMessage}")
    private String cookieMessage;

    @Value("${afterHeader}")
    private String afterHeader;

    @Value("${content}")
    private String content;

    @Value("${footerTop}")
    private String footerTop;

    @Value("${footerSupportLinks}")
    private String footerSupportLinks;

    @Value("${licenceMessage}")
    private String licenceMessage;

    @Value("${bodyEnd}")
    private String bodyEnd;

    @Value("${bodyClasses}")
    private String bodyClasses;

    @Value("${headerClass}")
    private String headerClass;

    @Value("${homepageUrl}")
    private String homepageUrl;

    @Value("${logoLinkTitle}")
    private String logoLinkTitle;

    @Value("${crownCopyrightMessage}")
    private String crownCopyrightMessage;

    @RequestMapping("/")
    public ModelAndView index() {
        System.out.println("request received ");
        Map<String, String> params = new HashMap<>();

        params.put("topOfPage", topOfPage);
        params.put("htmlLang", htmlLang);

        params.put("pageTitle", pageTitle);
        params.put("head", head);
        params.put("assetPath", assetPath);
        params.put("bodyStart", bodyStart);
        params.put("skipLinkMessage", skipLinkMessage);
        params.put("globalHeaderText", globalHeaderText);
        params.put("insideHeader", insideHeader);
        params.put("propositionHeader", propositionHeader);
        params.put("cookieMessage", cookieMessage);
        params.put("afterHeader", afterHeader);
        params.put("content", content);

        params.put("footerTop", footerTop);
        params.put("footerSupportLinks", footerSupportLinks);
        params.put("licenceMessage", licenceMessage);
        params.put("bodyEnd", bodyEnd);
        params.put("bodyClasses", bodyClasses);
        params.put("headerClass", headerClass);

        params.put("homepageUrl", homepageUrl);
        params.put("logoLinkTitle", logoLinkTitle);

        params.put("crownCopyrightMessage", crownCopyrightMessage);


        return new ModelAndView("index", params);
    }
}

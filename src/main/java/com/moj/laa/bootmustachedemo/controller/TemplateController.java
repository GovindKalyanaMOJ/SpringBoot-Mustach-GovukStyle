package com.moj.laa.bootmustachedemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;

/**
 * All the properties declared below are defined in the application.yml file. All these properties
 * have a place holder in the mustache template. Feel free to add more or remove any according to your application.
 * The point is that, all the place mustache place holders {{}} or {{{}}} should be available in the model so that
 * they get replaced when the actual html content gets generated. So these can be defined and made use of any which
 * convenient fashion a developer would prefer keeping in mind to avoid boiler-plate code and DRY principle.
 */
@Controller
public abstract class TemplateController {

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

    protected Map<String, String> params() {

        final Map<String, String> params = new HashMap<>();
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
        return params;
    }

}

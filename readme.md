## Spring Boot  Mustache Govuk Assets Prototype

**Overview**
	Objective of this exercise is to create a prototype to demonstrate how to produce a working spring boot based MVC application utilising
	the mustache template to do server side html generation utilizing govuk-template, govuk-element-sass, govuk_frontend_toolkit.


### Simple Steps to get started

- Clone this repository
- Run the application as one would do with any spring boot application
- Access the local host on port 8080 (if you have not changed any defaults)
- You can build your application just by adding your code on top of this and push it into your own git repository.

you can view an application with header, menu links, footer, and a message with an icon attached to it.


### Making of this prototype and fine points to be noted.

**Gradle Notes**

    Please take a note of these in the build.gradle file
        compile('org.springframework.boot:spring-boot-starter-mustache')
        compile('org.springframework.boot:spring-boot-starter-web')

    Compile scss files during the boot run
        gulp_build.dependsOn 'installGulp'
        gulp_build.dependsOn 'npmInstall'

        bootRun.dependsOn gulp_build

        apply plugin: "com.moowork.gulp"

        classpath("com.moowork.gradle:gradle-gulp-plugin:0.10")

**application.yml notes**

    spring:
      mustache:
        enabled: true
        prefix: classpath:/templates/
        check-template-location: true
        suffix: .html

**Mustache Notes**

    Several fragment files are created and stored under /resources/templates/fragments
    index.html shows how these fragments are used.

**npm (Node Package Manager Notes)**

    Install npm i govuk_template_mustache
    Install npm i govuk-elements-sass
    Install npm install govuk_frontend_toolkit

**Gulp Notes**

    Gulp is used as the tool to manage the gov-uk scss files. Please see the gulp.js and all the gulp files
    under ./gulp folder

    Gulp does the following
    - Fetches the govuk_template_mustache, govuk-elements-sass and govuk_frontend_toolkit from node_modules and moves
    the configured artifacts to src/resources/static/govuk_modules.

    - Compiles all the scss files from govuk-elements-sass and govuk_frontend_toolkit and produces a global.css file
    under src/resources/static/css/global.css

**global.scss**

     This is an important file where we plugin the entire gov-uk style elements. Along with this when gulp build is run
     a global.css file gets produced at /resources/static/css/global.css which contains compiled css elements from
     govuk-elements-sass and govuk_frontend_toolkit.

     $path: "/govuk_modules/govuk_frontend_toolkit/images/" - relative location of various images used by
     govuk-template-saas and govuk_frontend_toolkit.


**govuk-template.css**

    This file can be found under src/resources/static/govuk_template/assets/stylesheets. This is needed for the header
    and footer construction in the html.

**head.html**

    Please take a note of how two crucial css files are included in here

    <link rel="stylesheet" media="screen" href="/css/global.css"/>
    <link rel="stylesheet" media="screen" href="{{{ assetPath }}}stylesheets/govuk-template.css?0.24.0"/>

    {{{assetPath}}} is defined in application.yml and injected through the model in the MustacheDemoController.java

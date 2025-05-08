<!--
Hey, thanks for using the awesome-readme-template template.  
If you have any enhancements, then fork this project and create a pull request 
or just open an issue with the label "enhancement".

Don't forget to give this project a star for additional support ;)
Maybe you can mention me or this repo in the acknowledgements too
-->
<div align="center">

  <img src="documentation/assets/mlc_header_mwn.png" alt="logo" width="800" height="auto" />
  <h1>JAXB2 Implementation for DDEX MWN Notifications</h1>
    
  
<!-- Badges -->
<p>
  <a href="https://github.com/TheMLC/ddex-messages-mwn-notification/graphs/contributors">
    <img src="https://img.shields.io/github/contributors/TheMLC/ddex-messages-mwn-notification" alt="contributors" />
  </a>
  <a href="">
    <img src="https://img.shields.io/github/last-commit/TheMLC/ddex-messages-mwn-notification" alt="last update" />
  </a>
  <a href="https://github.com/TheMLC/ddex-messages-mwn-notification/network/members">
    <img src="https://img.shields.io/github/forks/TheMLC/ddex-messages-mwn-notification" alt="forks" />
  </a>
  <a href="https://github.com/TheMLC/ddex-messages-mwn-notification/stargazers">
    <img src="https://img.shields.io/github/stars/TheMLC/ddex-messages-mwn-notification" alt="stars" />
  </a>
  <a href="https://github.com/TheMLC/ddex-messages-mwn-notification/issues/">
    <img src="https://img.shields.io/github/issues/TheMLC/ddex-messages-mwn-notification" alt="open issues" />
  </a>
</p>
   
</div>

<br />

<!-- Table of Contents -->
# :notebook_with_decorative_cover: Table of Contents

- [About the Project](#star2-about-the-project)
  * [Tech Stack](#space_invader-tech-stack)
  * [Features](#dart-features)
- [Getting Started](#toolbox-getting-started)
  * [Prerequisites](#bangbang-prerequisites)
  * [Generating Java Files](#gear-generating-the-java-files)
  * [Installing the Maven artifact](#gear-installing-the-maven-artifact)
<!-- - [Contributing](#wave-contributing)
  * [Code of Conduct](#scroll-code-of-conduct)
- [FAQ](#grey_question-faq)
- [License](#warning-license) -->
- [Contact](#handshake-contact)
- [Acknowledgements](#gem-acknowledgements)

  

<!-- About the Project -->
## :star2: About the Project

<!-- TechStack -->
### :space_invader: Tech Stack

<ul>
<li><a href=" https://kb.ddex.net/implementing-each-standard/musical-work-data-and-rights-communication-(mwdr)/musical-work-right-share-notification-standard-(mwn)/"> DDEX MWN Messages</a></li>
<li><a href="https://openjdk.org/projects/jdk/21/">Java 21</a></li>
<li><a href="https://docs.oracle.com/javase/8/docs/technotes/tools/unix/xjc.html">xjc</a></li>
<li><a href="https://maven.apache.org/">Maven</a></li>
<li><a href="https://www.mojohaus.org/jaxb2-maven-plugin/Documentation/v2.3/">JAXB2 Maven Plugin 2.3</a></li>
</ul>

<!-- Features -->
### :dart: Features
Generate JAVA Classes that directly masp to composites in the MWN xsds as well as the Allowed Value Sets.
Current supported versions include 

<ul>
<li>MWN 1.1</li>
<li>MWN 1.3 Draft version</li>
<li>MWN 1.3</li>
</ul>

<!-- Getting Started -->
## 	:toolbox: Getting Started

<!-- Prerequisites -->
### :bangbang: Prerequisites

This project uses JAVA with Java 11 being the minimum version required.<br />
If you don't have Java installed, we recommend installing the latest version of Java using your favourite package manager.

On Mac OS with Homebrew
```bash
 brew install java
```

<br />


Once Java is installed, Maven is also required.

On Mac OS with Homebrew
```bash
 brew install maven
```
<br /><br />

<!-- Generating the Java Files -->
### :gear: Generating the Java Files

Use the Makefile provided to run the generation of Java files

For MWN 1.1
```bash
  make generate-mwn-11
```
This will generate java files in ``ddex-mwn-11/target/generated-sources/xjc`` directory
   

For MWN 1.3 Draft
```bash
  make generate-mwn-13-draft
```
This will generate java files in ``ddex-mwn-13Draft/target/generated-sources/xjc`` directory   
   

For MWN 1.3
```bash
  make generate-mwn-13
```
This will generate java files in ``ddex-mwn-13/target/generated-sources/xjc`` directory
   
<br /><br />

<!-- Installing the Maven artifact -->
### :gear: Installing the Maven artifact

Maven will generate an artifact (JAR file) for you. It can be installed in your local repository to be used in other projects.

Use the Makefile provided to run the generation of Java files

For MWN 1.1
```bash
  make install-mwn-11
```
This will install a new artifact ``net.ddex.messages:mwn-notification:1.1``
```xml
            <dependency>
                <groupId>net.ddex.messages</groupId>
                <artifactId>mwn-notification</artifactId>
                <version>1.1</version>
            </dependency>
```


<br />


For MWN 1.3 Draft
```bash
  make install-mwn-13-draft
```
This will install a new artifact ``net.ddex.messages:mwn-notification:1.3Draft``
```xml
            <dependency>
                <groupId>net.ddex.messages</groupId>
                <artifactId>mwn-notification</artifactId>
                <version>1.3Draft</version>
            </dependency>
```


<br />


For MWN 1.3
```bash
  make install-mwn-13
```
This will install a new artifact ``net.ddex.messages:mwn-notification:1.3``
```xml
            <dependency>
                <groupId>net.ddex.messages</groupId>
                <artifactId>mwn-notification</artifactId>
                <version>1.3Draft</version>
            </dependency>
```




<!-- 
Contributions are always welcome!

See `contributing.md` for ways to get started. -->


<!-- Code of Conduct -->
<!-- ### :scroll: Code of Conduct

Please read the [Code of Conduct](https://github.com/TheMLC/ddex-messages-mwn-notification/blob/main/CODE_OF_CONDUCT.md) -->


<!-- License -->
<!-- ## :warning: License

Distributed under the no License. See LICENSE.txt for more information.
 -->

<!-- Contact -->
## :handshake: Contact

Project Link: [https://github.com/TheMLC/ddex-messages-mwn-notification](https://github.com/TheMLC/ddex-messages-mwn-notification)


<!-- Acknowledgments -->
## :gem: Acknowledgements

For Providing this Awesome Template
 - [Awesome README](https://github.com/matiassingers/awesome-readme)

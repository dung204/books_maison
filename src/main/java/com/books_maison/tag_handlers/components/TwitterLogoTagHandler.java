package com.books_maison.tag_handlers.components;

import java.io.IOException;
import java.util.logging.Logger;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.TagSupport;

public class TwitterLogoTagHandler extends TagSupport {
  private Logger logger = Logger.getLogger(TwitterLogoTagHandler.class.getName());

  @Override
  public int doStartTag() throws JspException {
    try {
      pageContext.getOut().print(
          """
              <i class="bi bi-twitter-x fs-4"></i>
              """);
    } catch (IOException e) {
      logger.severe(e.getMessage());
    }
    return SKIP_BODY;
  }
}
/*Generated by WaveMaker Studio*/
package com.alltypeservsforservdefs_9_0_0_1.classicmodels;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

public class ArticleTagssxId implements Serializable {

    private Integer articleId;
    private Integer tagId;
    private String blank;

    public Integer getArticleId() {
        return this.articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getTagId() {
        return this.tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getBlank() {
        return this.blank;
    }

    public void setBlank(String blank) {
        this.blank = blank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArticleTagssx)) return false;
        final ArticleTagssx articleTagssx = (ArticleTagssx) o;
        return Objects.equals(getArticleId(), articleTagssx.getArticleId()) &&
                Objects.equals(getTagId(), articleTagssx.getTagId()) &&
                Objects.equals(getBlank(), articleTagssx.getBlank());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getArticleId(),
                getTagId(),
                getBlank());
    }
}
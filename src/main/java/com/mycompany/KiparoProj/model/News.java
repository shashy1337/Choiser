
package com.mycompany.KiparoProj.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class News {

    @SerializedName("date")
    private String mDate;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("id")
    private Long mId;
    @SerializedName("keywords")
    private List<String> mKeywords;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("visible")
    private Boolean mVisible;

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public List<String> getKeywords() {
        return mKeywords;
    }

    public void setKeywords(List<String> keywords) {
        mKeywords = keywords;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Boolean getVisible() {
        return mVisible;
    }

    public void setVisible(Boolean visible) {
        mVisible = visible;
    }

}

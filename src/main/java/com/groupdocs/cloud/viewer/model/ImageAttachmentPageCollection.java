/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ImageAttachmentPageCollection.java">
 *   Copyright (c) 2003-2018 Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.viewer.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.viewer.model.ImagePage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Describes attachment pages.
 */
@ApiModel(description = "Describes attachment pages.")
public class ImageAttachmentPageCollection {
  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("folder")
  private String folder = null;

  @SerializedName("attachmentName")
  private String attachmentName = null;

  @SerializedName("pages")
  private List<ImagePage> pages = null;

  public ImageAttachmentPageCollection fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * File name.
   * @return fileName
  **/
  @ApiModelProperty(value = "File name.")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public ImageAttachmentPageCollection folder(String folder) {
    this.folder = folder;
    return this;
  }

   /**
   * File folder.
   * @return folder
  **/
  @ApiModelProperty(value = "File folder.")
  public String getFolder() {
    return folder;
  }

  public void setFolder(String folder) {
    this.folder = folder;
  }

  public ImageAttachmentPageCollection attachmentName(String attachmentName) {
    this.attachmentName = attachmentName;
    return this;
  }

   /**
   * Name of the attachment.
   * @return attachmentName
  **/
  @ApiModelProperty(value = "Name of the attachment.")
  public String getAttachmentName() {
    return attachmentName;
  }

  public void setAttachmentName(String attachmentName) {
    this.attachmentName = attachmentName;
  }

  public ImageAttachmentPageCollection pages(List<ImagePage> pages) {
    this.pages = pages;
    return this;
  }

  public ImageAttachmentPageCollection addPagesItem(ImagePage pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<ImagePage>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * Pages list.
   * @return pages
  **/
  @ApiModelProperty(value = "Pages list.")
  public List<ImagePage> getPages() {
    return pages;
  }

  public void setPages(List<ImagePage> pages) {
    this.pages = pages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageAttachmentPageCollection imageAttachmentPageCollection = (ImageAttachmentPageCollection) o;
    return Objects.equals(this.fileName, imageAttachmentPageCollection.fileName) &&
        Objects.equals(this.folder, imageAttachmentPageCollection.folder) &&
        Objects.equals(this.attachmentName, imageAttachmentPageCollection.attachmentName) &&
        Objects.equals(this.pages, imageAttachmentPageCollection.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, folder, attachmentName, pages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageAttachmentPageCollection {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    attachmentName: ").append(toIndentedString(attachmentName)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


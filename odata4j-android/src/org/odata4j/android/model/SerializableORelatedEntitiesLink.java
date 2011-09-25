package org.odata4j.android.model;

import java.io.Serializable;
import java.util.List;

import org.odata4j.core.OEntity;
import org.odata4j.core.ORelatedEntitiesLink;

public class SerializableORelatedEntitiesLink implements ORelatedEntitiesLink, Serializable {

  private static final long serialVersionUID = 2362730336435399569L;

  private final String href;
  private final String relation;
  private final String title;
  private final boolean isCollection;
  private final boolean isInline;

  public SerializableORelatedEntitiesLink(ORelatedEntitiesLink link) {
    this.href = link.getHref();
    this.relation = link.getRelation();
    this.title = link.getTitle();
    this.isCollection = link.isCollection();
    this.isInline = link.isInline();
  }

  @Override
  public String getHref() {
    return href;
  }

  @Override
  public String getRelation() {
    return relation;
  }

  @Override
  public String getTitle() {
    return title;
  }

  @Override
  public List<OEntity> getRelatedEntities() {
    throw new UnsupportedOperationException();
  }

  @Override
  public OEntity getRelatedEntity() {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isCollection() {
    return isCollection;
  }

  @Override
  public boolean isInline() {
    return isInline;
  }

}
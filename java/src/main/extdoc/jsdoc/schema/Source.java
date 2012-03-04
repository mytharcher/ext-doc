/*     */ package extdoc.jsdoc.schema;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAttribute;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="")
/*     */ @XmlRootElement(name="source")
/*     */ public class Source
/*     */ {
/*     */ 
/*     */   @XmlAttribute(required=true)
/*     */   protected String src;
/*     */ 
/*     */   @XmlAttribute
/*     */   protected String match;
/*     */ 
/*     */   @XmlAttribute
/*     */   protected Boolean skipHidden;
/*     */ 
/*     */   public String getSrc()
/*     */   {
/*  58 */     return this.src;
/*     */   }
/*     */ 
/*     */   public void setSrc(String value)
/*     */   {
/*  70 */     this.src = value;
/*     */   }
/*     */ 
/*     */   public String getMatch()
/*     */   {
/*  82 */     return this.match;
/*     */   }
/*     */ 
/*     */   public void setMatch(String value)
/*     */   {
/*  94 */     this.match = value;
/*     */   }
/*     */ 
/*     */   public Boolean isSkipHidden()
/*     */   {
/* 106 */     return this.skipHidden;
/*     */   }
/*     */ 
/*     */   public void setSkipHidden(Boolean value)
/*     */   {
/* 118 */     this.skipHidden = value;
/*     */   }
/*     */ }

/* Location:           D:\Work\lib\ext-doc-decompile\
 * Qualified Name:     extdoc.jsdoc.schema.Source
 * JD-Core Version:    0.6.0
 */
/*     */ package extdoc.jsdoc.schema;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAttribute;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"sources", "tags"})
/*     */ @XmlRootElement(name="doc")
/*     */ public class Doc
/*     */ {
/*     */ 
/*     */   @XmlElement(required=true)
/*     */   protected Sources sources;
/*     */   protected Tags tags;
/*     */ 
/*     */   @XmlAttribute(required=true)
/*     */   protected String version;
/*     */ 
/*     */   public Sources getSources()
/*     */   {
/*  63 */     return this.sources;
/*     */   }
/*     */ 
/*     */   public void setSources(Sources value)
/*     */   {
/*  75 */     this.sources = value;
/*     */   }
/*     */ 
/*     */   public Tags getTags()
/*     */   {
/*  87 */     return this.tags;
/*     */   }
/*     */ 
/*     */   public void setTags(Tags value)
/*     */   {
/*  99 */     this.tags = value;
/*     */   }
/*     */ 
/*     */   public String getVersion()
/*     */   {
/* 111 */     return this.version;
/*     */   }
/*     */ 
/*     */   public void setVersion(String value)
/*     */   {
/* 123 */     this.version = value;
/*     */   }
/*     */ }

/* Location:           D:\Work\lib\ext-doc-decompile\
 * Qualified Name:     extdoc.jsdoc.schema.Doc
 * JD-Core Version:    0.6.0
 */
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
/*     */ @XmlRootElement(name="tag")
/*     */ public class Tag
/*     */ {
/*     */ 
/*     */   @XmlAttribute(required=true)
/*     */   protected String name;
/*     */ 
/*     */   @XmlAttribute
/*     */   protected String title;
/*     */ 
/*     */   @XmlAttribute
/*     */   protected String format;
/*     */ 
/*     */   public String getName()
/*     */   {
/*  58 */     return this.name;
/*     */   }
/*     */ 
/*     */   public void setName(String value)
/*     */   {
/*  70 */     this.name = value;
/*     */   }
/*     */ 
/*     */   public String getTitle()
/*     */   {
/*  82 */     return this.title;
/*     */   }
/*     */ 
/*     */   public void setTitle(String value)
/*     */   {
/*  94 */     this.title = value;
/*     */   }
/*     */ 
/*     */   public String getFormat()
/*     */   {
/* 106 */     return this.format;
/*     */   }
/*     */ 
/*     */   public void setFormat(String value)
/*     */   {
/* 118 */     this.format = value;
/*     */   }
/*     */ }

/* Location:           D:\Work\lib\ext-doc-decompile\
 * Qualified Name:     extdoc.jsdoc.schema.Tag
 * JD-Core Version:    0.6.0
 */
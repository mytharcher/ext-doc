/*     */ package extdoc.jsdoc.tplschema;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"classTemplate", "treeTemplate", "source", "resources"})
/*     */ @XmlRootElement(name="template")
/*     */ public class Template
/*     */ {
/*     */ 
/*     */   @XmlElement(required=true)
/*     */   protected ClassTemplate classTemplate;
/*     */ 
/*     */   @XmlElement(required=true)
/*     */   protected TreeTemplate treeTemplate;
/*     */ 
/*     */   @XmlElement(required=true)
/*     */   protected Source source;
/*     */ 
/*     */   @XmlElement(required=true)
/*     */   protected Resources resources;
/*     */ 
/*     */   public ClassTemplate getClassTemplate()
/*     */   {
/*  68 */     return this.classTemplate;
/*     */   }
/*     */ 
/*     */   public void setClassTemplate(ClassTemplate value)
/*     */   {
/*  80 */     this.classTemplate = value;
/*     */   }
/*     */ 
/*     */   public TreeTemplate getTreeTemplate()
/*     */   {
/*  92 */     return this.treeTemplate;
/*     */   }
/*     */ 
/*     */   public void setTreeTemplate(TreeTemplate value)
/*     */   {
/* 104 */     this.treeTemplate = value;
/*     */   }
/*     */ 
/*     */   public Source getSource()
/*     */   {
/* 116 */     return this.source;
/*     */   }
/*     */ 
/*     */   public void setSource(Source value)
/*     */   {
/* 128 */     this.source = value;
/*     */   }
/*     */ 
/*     */   public Resources getResources()
/*     */   {
/* 140 */     return this.resources;
/*     */   }
/*     */ 
/*     */   public void setResources(Resources value)
/*     */   {
/* 152 */     this.resources = value;
/*     */   }
/*     */ }

/* Location:           D:\Work\lib\ext-doc-decompile\
 * Qualified Name:     extdoc.jsdoc.tplschema.Template
 * JD-Core Version:    0.6.0
 */
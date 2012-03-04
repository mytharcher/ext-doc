/*    */ package extdoc.jsdoc.tplschema;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlAttribute;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="")
/*    */ @XmlRootElement(name="treeTemplate")
/*    */ public class TreeTemplate
/*    */ {
/*    */ 
/*    */   @XmlAttribute(required=true)
/*    */   protected String tpl;
/*    */ 
/*    */   @XmlAttribute(required=true)
/*    */   protected String targetFile;
/*    */ 
/*    */   public String getTpl()
/*    */   {
/* 55 */     return this.tpl;
/*    */   }
/*    */ 
/*    */   public void setTpl(String value)
/*    */   {
/* 67 */     this.tpl = value;
/*    */   }
/*    */ 
/*    */   public String getTargetFile()
/*    */   {
/* 79 */     return this.targetFile;
/*    */   }
/*    */ 
/*    */   public void setTargetFile(String value)
/*    */   {
/* 91 */     this.targetFile = value;
/*    */   }
/*    */ }

/* Location:           D:\Work\lib\ext-doc-decompile\
 * Qualified Name:     extdoc.jsdoc.tplschema.TreeTemplate
 * JD-Core Version:    0.6.0
 */
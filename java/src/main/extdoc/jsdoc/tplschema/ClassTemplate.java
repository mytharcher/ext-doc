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
/*    */ @XmlRootElement(name="classTemplate")
/*    */ public class ClassTemplate
/*    */ {
/*    */ 
/*    */   @XmlAttribute(required=true)
/*    */   protected String tpl;
/*    */ 
/*    */   @XmlAttribute(required=true)
/*    */   protected String targetDir;
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
/*    */   public String getTargetDir()
/*    */   {
/* 79 */     return this.targetDir;
/*    */   }
/*    */ 
/*    */   public void setTargetDir(String value)
/*    */   {
/* 91 */     this.targetDir = value;
/*    */   }
/*    */ }

/* Location:           D:\Work\lib\ext-doc-decompile\
 * Qualified Name:     extdoc.jsdoc.tplschema.ClassTemplate
 * JD-Core Version:    0.6.0
 */
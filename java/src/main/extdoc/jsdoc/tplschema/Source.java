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
/*    */ @XmlRootElement(name="source")
/*    */ public class Source
/*    */ {
/*    */ 
/*    */   @XmlAttribute(required=true)
/*    */   protected String targetDir;
/*    */ 
/*    */   @XmlAttribute(required=true)
/*    */   protected String wrapper;
/*    */ 
/*    */   public String getTargetDir()
/*    */   {
/* 55 */     return this.targetDir;
/*    */   }
/*    */ 
/*    */   public void setTargetDir(String value)
/*    */   {
/* 67 */     this.targetDir = value;
/*    */   }
/*    */ 
/*    */   public String getWrapper()
/*    */   {
/* 79 */     return this.wrapper;
/*    */   }
/*    */ 
/*    */   public void setWrapper(String value)
/*    */   {
/* 91 */     this.wrapper = value;
/*    */   }
/*    */ }

/* Location:           D:\Work\lib\ext-doc-decompile\
 * Qualified Name:     extdoc.jsdoc.tplschema.Source
 * JD-Core Version:    0.6.0
 */
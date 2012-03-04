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
/*    */ @XmlRootElement(name="copy")
/*    */ public class Copy
/*    */ {
/*    */ 
/*    */   @XmlAttribute(required=true)
/*    */   protected String src;
/*    */ 
/*    */   @XmlAttribute(required=true)
/*    */   protected String dst;
/*    */ 
/*    */   public String getSrc()
/*    */   {
/* 55 */     return this.src;
/*    */   }
/*    */ 
/*    */   public void setSrc(String value)
/*    */   {
/* 67 */     this.src = value;
/*    */   }
/*    */ 
/*    */   public String getDst()
/*    */   {
/* 79 */     return this.dst;
/*    */   }
/*    */ 
/*    */   public void setDst(String value)
/*    */   {
/* 91 */     this.dst = value;
/*    */   }
/*    */ }

/* Location:           D:\Work\lib\ext-doc-decompile\
 * Qualified Name:     extdoc.jsdoc.tplschema.Copy
 * JD-Core Version:    0.6.0
 */
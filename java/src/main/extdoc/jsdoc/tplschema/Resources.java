/*    */ package extdoc.jsdoc.tplschema;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="", propOrder={"copy"})
/*    */ @XmlRootElement(name="resources")
/*    */ public class Resources
/*    */ {
/*    */   protected List<Copy> copy;
/*    */ 
/*    */   @SuppressWarnings("unchecked")
public List<Copy> getCopy()
/*    */   {
/* 70 */     if (this.copy == null) {
/* 71 */       this.copy = new ArrayList();
/*    */     }
/* 73 */     return this.copy;
/*    */   }
/*    */ }

/* Location:           D:\Work\lib\ext-doc-decompile\
 * Qualified Name:     extdoc.jsdoc.tplschema.Resources
 * JD-Core Version:    0.6.0
 */
/*    */ package extdoc.jsdoc.schema;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="", propOrder={"tag"})
/*    */ @XmlRootElement(name="tags")
/*    */ public class Tags
/*    */ {
/*    */   protected List<Tag> tag;
/*    */ 
/*    */   @SuppressWarnings("unchecked")
public List<Tag> getTag()
/*    */   {
/* 70 */     if (this.tag == null) {
/* 71 */       this.tag = new ArrayList();
/*    */     }
/* 73 */     return this.tag;
/*    */   }
/*    */ }

/* Location:           D:\Work\lib\ext-doc-decompile\
 * Qualified Name:     extdoc.jsdoc.schema.Tags
 * JD-Core Version:    0.6.0
 */
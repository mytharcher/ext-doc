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
/*    */ @XmlType(name="", propOrder={"source"})
/*    */ @XmlRootElement(name="sources")
/*    */ public class Sources
/*    */ {
/*    */   protected List<Source> source;
/*    */ 
/*    */   @SuppressWarnings("unchecked")
public List<Source> getSource()
/*    */   {
/* 70 */     if (this.source == null) {
/* 71 */       this.source = new ArrayList();
/*    */     }
/* 73 */     return this.source;
/*    */   }
/*    */ }

/* Location:           D:\Work\lib\ext-doc-decompile\
 * Qualified Name:     extdoc.jsdoc.schema.Sources
 * JD-Core Version:    0.6.0
 */
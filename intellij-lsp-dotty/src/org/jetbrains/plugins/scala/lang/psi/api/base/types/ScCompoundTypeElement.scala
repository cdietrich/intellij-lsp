package org.jetbrains.plugins.scala.lang.psi.api.base.types

/**
* @author Alexander Podkhalyuzin
* Date: 22.02.2008
*/

trait ScCompoundTypeElement extends ScTypeElement {
  override protected val typeName = "CompoundType"

  def components : Seq[ScTypeElement] = findChildrenByClassScala(classOf[ScTypeElement]).toSeq
  def refinement: Option[ScRefinement] = findChild(classOf[ScRefinement])
}

object ScCompoundTypeElement {
  def unapply(cte: ScCompoundTypeElement): Option[(Seq[ScTypeElement], Option[ScRefinement])] = Option(cte.components, cte.refinement)
}


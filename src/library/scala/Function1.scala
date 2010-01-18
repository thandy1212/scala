/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2010, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id$

// generated by genprod on Sun Jan 17 19:38:09 PST 2010 (with fancy comment) (with extra methods)

package scala



/** <p>
 *    Function with 1 parameter.
 *  </p>
 *  <p>
 * In the following example the definition of
 *    <code>succ</code> is a shorthand for the anonymous class
 *    definition <code>anonfun1</code>:
 *  </p>
 *  <pre>
 *  <b>object</b> Main <b>extends</b> Application {
 *
 *    <b>val</b> succ = (x: Int) => x + 1
 *
 *    <b>val</b> anonfun1 = <b>new</b> Function1[Int, Int] {
 *      <b>def</b> apply(x: Int): Int = x + 1
 *    }
 *
 *    println(succ(0))
 *    println(anonfun1(0))
 *  }</pre>
 */
trait Function1[-T1, +R] extends AnyRef { self =>
  def apply(v1:T1): R
  override def toString() = "<function1>"

  /** (f compose g)(x) ==  f(g(x))
   */
  def compose[A](g: A => T1): A => R = { x => apply(g(x)) }

  /** (f andThen g)(x) ==  g(f(x))
   */
  def andThen[A](g: R => A): T1 => A = { x => g(apply(x)) }

}

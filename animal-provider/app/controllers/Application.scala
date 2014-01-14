package controllers

import play.api.mvc._
import play.api.libs.json.Json

object Application extends Controller {

  def index = Action {
    Ok(Json.arr(Json.obj("name" -> "Bob")))
  }

  def enterState = Action {
    Ok
  }

}
package org.carreiro.pointrankings

/**
  * The NFL teams
  */
sealed trait Team

object Teams {
  case object NE extends Team
  case object NYJ extends Team
  case object BUF extends Team
  case object MIA extends Team

  case object PIT extends Team
  case object CIN extends Team
  case object CLE extends Team
  case object BAL extends Team

  case object HOU extends Team
  case object JAX extends Team
  case object TEN extends Team
  case object IND extends Team

  case object KC extends Team
  case object OAK extends Team
  case object SD extends Team
  case object DEN extends Team

  case object NYG extends Team
  case object PHI extends Team
  case object WAS extends Team
  case object DAL extends Team

  case object GB extends Team
  case object CHI extends Team
  case object DET extends Team
  case object MIN extends Team

  case object ATL extends Team
  case object CAR extends Team
  case object TB extends Team
  case object NO extends Team

  case object LA extends Team
  case object ARI extends Team
  case object SEA extends Team
  case object SF extends Team

  val afcEast: Set[Team] = Set(NE, NYJ, BUF, MIA)
  val afcNorth: Set[Team] = Set(PIT, CIN, CLE, BAL)
  val afcSouth: Set[Team] = Set(HOU, JAX, TEN, IND)
  val afcWest: Set[Team] = Set(KC, OAK, SD, DEN)
  val afc: Set[Team] = afcEast ++ afcNorth ++ afcSouth ++ afcWest

  val nfcEast: Set[Team] = Set(NYG, PHI, WAS, DAL)
  val nfcNorth: Set[Team] = Set(GB, CHI, DET, MIN)
  val nfcSouth: Set[Team] = Set(ATL, CAR, TB, NO)
  val nfcWest: Set[Team] = Set(LA, ARI, SEA, SF)
  val nfc: Set[Team] = nfcEast ++ nfcNorth ++ nfcSouth ++ nfcWest

  val nfl: Set[Team] = afc ++ nfc
}


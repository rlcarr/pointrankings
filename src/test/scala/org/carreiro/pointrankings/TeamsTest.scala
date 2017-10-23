package org.carreiro.pointrankings

import org.scalatest.{FreeSpec, Matchers}

import org.carreiro.pointrankings.Teams._

class TeamsTest
  extends FreeSpec
    with Matchers {
  "Teams" - {
    "AFC" - {
      "East" in {
        afcEast should ===(Set(NE, NYJ, BUF, MIA))
      }

      "North" in {
        afcNorth should ===(Set(PIT, CIN, CLE, BAL))
      }

      "South" in {
        afcSouth should ===(Set(HOU, JAX, TEN, IND))
      }

      "West" in {
        afcWest should ===(Set(KC, SD, OAK, DEN))
      }

      "All" in {
        afc should ===(afcEast ++ afcNorth ++ afcSouth ++ afcWest)
      }
    }

    "NFC" - {
      "East" in {
        nfcEast should ===(Set(NYG, PHI, WAS, DAL))
      }

      "North" in {
        nfcNorth should ===(Set(GB, CHI, DET, MIN))
      }

      "South" in {
        nfcSouth should ===(Set(NO, TB, CAR, ATL))
      }

      "West" in {
        nfcWest should ===(Set(LA, ARI, SEA, SF))
      }

      "All" in {
        nfc should ===(nfcEast ++ nfcNorth ++ nfcSouth ++ nfcWest)
      }
    }

    "NFL" in {
      nfl should===(afc ++ nfc)
    }
  }

}

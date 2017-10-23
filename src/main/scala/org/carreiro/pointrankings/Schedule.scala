package org.carreiro.pointrankings

final case class Score(away: Int, home: Int)

final case class Game(away: Team, home: Team, score: Option[Score] = None)

object Schedule {
  private def score(away: Int, home: Int): Option[Score] = {
    Option(Score(away, home))
  }

  import Teams._

  val games: Map[Int, Set[Game]] = Map(
    1 -> Set(
      Game(CAR, DEN, score(20, 21)),
      Game(GB, JAX, score(27, 23)),
      Game(SD, KC, score(27, 33)),
      Game(OAK, NO, score(35, 34)),
      Game(CIN, NYJ, score(23, 22)),
      Game(CLE, PHI, score(10, 29)),
      Game(MIN, TEN, score(25, 16)),
      Game(CHI, HOU, score(14, 23)),
      Game(BUF, BAL, score(7, 13)),
      Game(TB, ATL, score(31, 24)),
      Game(MIA, SEA, score(10, 12)),
      Game(NYG, DAL, score(20, 19)),
      Game(DET, IND, score(39, 35)),
      Game(NE, ARI, score(23, 21)),
      Game(PIT, WAS, score(38, 16)),
      Game(LA, SF, score(0, 28))
    ),
    2 -> Set(
      Game(NYJ, BUF, score(37, 31)),
      Game(SF, CAR, score(27, 46)),
      Game(DAL, WAS, score(27, 23)),
      Game(CIN, PIT, score(16, 24)),
      Game(NO, NYG, score(13, 16)),
      Game(MIA, NE, score(24, 31)),
      Game(KC, HOU, score(12, 19)),
      Game(TEN, DET, score(16, 15)),
      Game(BAL, CLE, score(25, 20)),
      Game(SEA, LA, score(3, 9)),
      Game(TB, ARI, score(7, 40)),
      Game(JAX, SD, score(14, 38)),
      Game(ATL, OAK, score(35, 28)),
      Game(IND, DEN, score(20, 34)),
      Game(GB, MIN, score(14, 17)),
      Game(PHI, CHI, score(29, 14))
    ),
    3 -> Set(
      Game(HOU, NE, score(0, 27)),
      Game(ARI, BUF, score(18, 33)),
      Game(OAK, TEN, score(17, 10)),
      Game(WAS, NYG, score(29, 27)),
      Game(CLE, MIA, score(24, 30)),
      Game(BAL, JAX, score(19, 17)),
      Game(DET, GB, score(27, 34)),
      Game(DEN, CIN, score(29, 17)),
      Game(MIN, CAR, score(22, 10)),
      Game(LA, TB, score(37, 32)),
      Game(SF, SEA, score(18, 37)),
      Game(NYJ, KC, score(3, 24)),
      Game(SD, IND, score(22, 26)),
      Game(PIT, PHI, score(3, 24)),
      Game(CHI, DAL, score(17, 31)),
      Game(ATL, NO, score(45, 32))
    ),
    4 -> Set(
      Game(MIA, CIN, score(7, 22)),
      Game(IND, JAX, score(27, 30)),
      Game(TEN, HOU, score(20, 27)),
      Game(CLE, WAS, score(20, 31)),
      Game(SEA, NYJ, score(27, 17)),
      Game(BUF, NE, score(16, 0)),
      Game(CAR, ATL, score(33, 48)),
      Game(OAK, BAL, score(28, 27)),
      Game(DET, CHI, score(14, 17)),
      Game(DEN, TB, score(27, 7)),
      Game(LA, ARI, score(17, 13)),
      Game(NO, SD, score(35, 34)),
      Game(DAL, SF, score(24, 17)),
      Game(KC, PIT, score(14, 43)),
      Game(NYG, MIN, score(10, 24))
    ),
    5 -> Set(
      Game(ARI, SF, score(33, 21)),
      Game(NE, CLE, score(33, 13)),
      Game(PHI, DET, score(23, 24)),
      Game(CHI, IND, score(23, 29)),
      Game(TEN, MIA, score(30, 17)),
      Game(WAS, BAL, score(16, 10)),
      Game(HOU, MIN, score(13, 31)),
      Game(NYJ, PIT, score(13, 31)),
      Game(ATL, DEN, score(23, 16)),
      Game(CIN, DAL, score(14, 28)),
      Game(BUF, LA, score(30, 19)),
      Game(SD, OAK, score(31, 34)),
      Game(NYG, GB, score(16, 23)),
      Game(TB, CAR, score(17, 14))
    ),
    6 -> Set(
      Game(DEN, SD, score(13, 21)),
      Game(SF, BUF, score(16, 45)),
      Game(PHI, WAS, score(20, 27)),
      Game(CLE, TEN, score(26, 28)),
      Game(BAL, NYJ, score(23, 27)),
      Game(CAR, NO, score(38, 41)),
      Game(JAX, CHI, score(17, 16)),
      Game(LA, DET, score(28, 31)),
      Game(PIT, MIA, score(15, 30)),
      Game(CIN, NE, score(17, 35)),
      Game(KC, OAK, score(26, 10)),
      Game(ATL, SEA, score(24, 26)),
      Game(DAL, GB, score(30, 16)),
      Game(IND, HOU, score(23, 26)),
      Game(NYJ, ARI, score(3, 28))
    ),
    7 -> Set(
      Game(CHI, GB, score(10, 26)),
      Game(NYG, LA, score(17, 10)),
      Game(NO, KC, score(21, 27)),
      Game(IND, TEN, score(34, 26)),
      Game(MIN, PHI, score(10, 21)),
      Game(CLE, CIN, score(17, 31)),
      Game(WAS, DET, score(17, 20)),
      Game(OAK, JAX, score(33, 16)),
      Game(BUF, MIA, score(25, 28)),
      Game(BAL, NYJ, score(16, 24)),
      Game(TB, SF, score(34, 17)),
      Game(SD, ATL, score(33, 30)),
      Game(NE, PIT, score(27, 16)),
      Game(SEA, ARI, score(6, 6)),
      Game(HOU, DEN, score(9, 27))
    ),
    8 -> Set(
      Game(JAX, HOU, score(22, 36)),
      Game(WAS, CIN, score(27, 27)),
      Game(KC, IND, score(30, 14)),
      Game(ARI, CAR, score(20, 30)),
      Game(OAK, TB, score(30, 24)),
      Game(SEA, NO, score(20, 25)),
      Game(DET, HOU, score(13, 20)),
      Game(NE, BUF, score(41, 25)),
      Game(NYJ, CLE, score(31, 28)),
      Game(SD, DEN, score(19, 27)),
      Game(GB, ATL, score(32, 33)),
      Game(PHI, DAL, score(23, 29)),
      Game(MIN, CHI, score(10, 20))
    ),
    9 -> Set(
      Game(ATL, TB, score(43, 28)),
      Game(DET, MIN),
      Game(PHI, NYG),
      Game(NYJ, MIA),
      Game(JAX, KC),
      Game(DAL, CLE),
      Game(PIT, BAL),
      Game(NO, SF),
      Game(CAR, LA),
      Game(IND, GB),
      Game(TEN, SD),
      Game(DEN, OAK),
      Game(BUF, SEA)
    ),
    10 -> Set(
      Game(CLE, BAL),
      Game(HOU, JAX),
      Game(DEN, NO),
      Game(LA, NYJ),
      Game(ATL, PHI),
      Game(KC, CAR),
      Game(CHI, TB),
      Game(MIN, WAS),
      Game(GB, TEN),
      Game(MIA, SD),
      Game(SF, ARI),
      Game(DAL, PIT),
      Game(SEA, NE),
      Game(CIN, NYG)
    ),
    11 -> Set(
      Game(NO, CAR),
      Game(PIT, CLE),
      Game(BAL, DAL),
      Game(JAX, DET),
      Game(TEN, IND),
      Game(BUF, CIN),
      Game(TB, KC),
      Game(CHI, NYG),
      Game(ARI, MIN),
      Game(MIA, LA),
      Game(NE, SF),
      Game(PHI, SEA),
      Game(GB, WAS),
      Game(HOU, OAK)

    ),
    12 -> Set(

    ),
    13 -> Set(

    ),
    14 -> Set(

    ),
    15 -> Set(

    ),
    16 -> Set(

    ),
    17 -> Set(

    )
  )
}

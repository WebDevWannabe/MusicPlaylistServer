package musicplaylist.service;

import musicplaylist.model.Score;
import musicplaylist.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class ScoreServiceImpl implements ScoreService {

    private ScoreRepository scoreRepository;

    @Autowired
    private void setScoreRepository(ScoreRepository scoreRepository) {
        this.scoreRepository = scoreRepository;
    }

    @Override
    public Score saveScores(Score score) {
       return scoreRepository.save(score);
    }

    @Override
    public Score findById(String teamName) {
        return scoreRepository.findOne(teamName);
    }

    @Override
    public String findTeamName(String teamName) {
        return scoreRepository.findTeamName(teamName);
    }

    @Override
    public Double[] findAveScorePercentages() {
        return scoreRepository.findAveScorePercentages();
    }

    @Override
    public void updateScores(double score1, double score2, double score3, double score4, double scorePercentage1,
                             double scorePercentage2, double scorePercentage3, double scorePercentage4,
                             double aveScorePercentage, String teamName) {
        scoreRepository.updateScores(score1, score2, score3, score4, scorePercentage1, scorePercentage2, scorePercentage3,
                scorePercentage4, aveScorePercentage, teamName);
    }
}

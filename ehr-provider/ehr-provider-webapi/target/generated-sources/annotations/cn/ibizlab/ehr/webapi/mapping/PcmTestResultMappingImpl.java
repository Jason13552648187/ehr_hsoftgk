package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmTestResult;
import cn.ibizlab.ehr.webapi.dto.PcmTestResultDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:52+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmTestResultMappingImpl implements PcmTestResultMapping {

    @Override
    public PcmTestResult toDomain(PcmTestResultDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmTestResult pcmTestResult = new PcmTestResult();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmTestResult.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmTestResult.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getTestresultname() != null ) {
            pcmTestResult.setTestresultname( dto.getTestresultname() );
        }
        if ( dto.getMatchdegree() != null ) {
            pcmTestResult.setMatchdegree( dto.getMatchdegree() );
        }
        if ( dto.getPsychologystatus() != null ) {
            pcmTestResult.setPsychologystatus( dto.getPsychologystatus() );
        }
        if ( dto.getAbilityscore() != null ) {
            pcmTestResult.setAbilityscore( dto.getAbilityscore() );
        }
        if ( dto.getBbsj() != null ) {
            pcmTestResult.setBbsj( dto.getBbsj() );
        }
        if ( dto.getAbilityscorereports() != null ) {
            pcmTestResult.setAbilityscorereports( dto.getAbilityscorereports() );
        }
        if ( dto.getAbilitygrade() != null ) {
            pcmTestResult.setAbilitygrade( dto.getAbilitygrade() );
        }
        if ( dto.getPsychologyhealthylevel() != null ) {
            pcmTestResult.setPsychologyhealthylevel( dto.getPsychologyhealthylevel() );
        }
        if ( dto.getJobfitdegree() != null ) {
            pcmTestResult.setJobfitdegree( dto.getJobfitdegree() );
        }
        if ( dto.getFlag() != null ) {
            pcmTestResult.setFlag( dto.getFlag() );
        }
        if ( dto.getFirsttest() != null ) {
            pcmTestResult.setFirsttest( dto.getFirsttest() );
        }
        if ( dto.getExamscore() != null ) {
            pcmTestResult.setExamscore( dto.getExamscore() );
        }
        if ( dto.getExamscorereports() != null ) {
            pcmTestResult.setExamscorereports( dto.getExamscorereports() );
        }
        if ( dto.getSecondtest() != null ) {
            pcmTestResult.setSecondtest( dto.getSecondtest() );
        }
        if ( dto.getPsychologyhealthylevelreports() != null ) {
            pcmTestResult.setPsychologyhealthylevelreports( dto.getPsychologyhealthylevelreports() );
        }
        if ( dto.getMatchdegreereports() != null ) {
            pcmTestResult.setMatchdegreereports( dto.getMatchdegreereports() );
        }
        if ( dto.getPcmprofileid() != null ) {
            pcmTestResult.setPcmprofileid( dto.getPcmprofileid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmTestResult.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmTestResult.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pcmTestResult.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmTestResult.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getTestresultid() != null ) {
            pcmTestResult.setTestresultid( dto.getTestresultid() );
        }
        if ( dto.getPcmprofilename() != null ) {
            pcmTestResult.setPcmprofilename( dto.getPcmprofilename() );
        }
        if ( dto.getCertificatenumber() != null ) {
            pcmTestResult.setCertificatenumber( dto.getCertificatenumber() );
        }

        return pcmTestResult;
    }

    @Override
    public PcmTestResultDTO toDto(PcmTestResult entity) {
        if ( entity == null ) {
            return null;
        }

        PcmTestResultDTO pcmTestResultDTO = new PcmTestResultDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmTestResultDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmTestResultDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getTestresultname() != null ) {
            pcmTestResultDTO.setTestresultname( entity.getTestresultname() );
        }
        if ( entity.getMatchdegree() != null ) {
            pcmTestResultDTO.setMatchdegree( entity.getMatchdegree() );
        }
        if ( entity.getPsychologystatus() != null ) {
            pcmTestResultDTO.setPsychologystatus( entity.getPsychologystatus() );
        }
        if ( entity.getAbilityscore() != null ) {
            pcmTestResultDTO.setAbilityscore( entity.getAbilityscore() );
        }
        if ( entity.getBbsj() != null ) {
            pcmTestResultDTO.setBbsj( entity.getBbsj() );
        }
        if ( entity.getAbilityscorereports() != null ) {
            pcmTestResultDTO.setAbilityscorereports( entity.getAbilityscorereports() );
        }
        if ( entity.getAbilitygrade() != null ) {
            pcmTestResultDTO.setAbilitygrade( entity.getAbilitygrade() );
        }
        if ( entity.getPsychologyhealthylevel() != null ) {
            pcmTestResultDTO.setPsychologyhealthylevel( entity.getPsychologyhealthylevel() );
        }
        if ( entity.getJobfitdegree() != null ) {
            pcmTestResultDTO.setJobfitdegree( entity.getJobfitdegree() );
        }
        if ( entity.getFlag() != null ) {
            pcmTestResultDTO.setFlag( entity.getFlag() );
        }
        if ( entity.getFirsttest() != null ) {
            pcmTestResultDTO.setFirsttest( entity.getFirsttest() );
        }
        if ( entity.getExamscore() != null ) {
            pcmTestResultDTO.setExamscore( entity.getExamscore() );
        }
        if ( entity.getExamscorereports() != null ) {
            pcmTestResultDTO.setExamscorereports( entity.getExamscorereports() );
        }
        if ( entity.getSecondtest() != null ) {
            pcmTestResultDTO.setSecondtest( entity.getSecondtest() );
        }
        if ( entity.getPsychologyhealthylevelreports() != null ) {
            pcmTestResultDTO.setPsychologyhealthylevelreports( entity.getPsychologyhealthylevelreports() );
        }
        if ( entity.getMatchdegreereports() != null ) {
            pcmTestResultDTO.setMatchdegreereports( entity.getMatchdegreereports() );
        }
        if ( entity.getPcmprofileid() != null ) {
            pcmTestResultDTO.setPcmprofileid( entity.getPcmprofileid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmTestResultDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmTestResultDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pcmTestResultDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmTestResultDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getTestresultid() != null ) {
            pcmTestResultDTO.setTestresultid( entity.getTestresultid() );
        }
        if ( entity.getPcmprofilename() != null ) {
            pcmTestResultDTO.setPcmprofilename( entity.getPcmprofilename() );
        }
        if ( entity.getCertificatenumber() != null ) {
            pcmTestResultDTO.setCertificatenumber( entity.getCertificatenumber() );
        }

        return pcmTestResultDTO;
    }

    @Override
    public List<PcmTestResult> toDomain(List<PcmTestResultDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmTestResult> list = new ArrayList<PcmTestResult>( dtoList.size() );
        for ( PcmTestResultDTO pcmTestResultDTO : dtoList ) {
            list.add( toDomain( pcmTestResultDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmTestResultDTO> toDto(List<PcmTestResult> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmTestResultDTO> list = new ArrayList<PcmTestResultDTO>( entityList.size() );
        for ( PcmTestResult pcmTestResult : entityList ) {
            list.add( toDto( pcmTestResult ) );
        }

        return list;
    }
}

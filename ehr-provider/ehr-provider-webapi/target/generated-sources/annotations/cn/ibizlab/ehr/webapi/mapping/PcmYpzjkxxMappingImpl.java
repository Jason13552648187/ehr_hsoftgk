package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmYpzjkxx;
import cn.ibizlab.ehr.webapi.dto.PcmYpzjkxxDTO;
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
    date = "2021-09-04T00:31:56+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmYpzjkxxMappingImpl implements PcmYpzjkxxMapping {

    @Override
    public PcmYpzjkxx toDomain(PcmYpzjkxxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmYpzjkxx pcmYpzjkxx = new PcmYpzjkxx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmYpzjkxx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmYpzjkxx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getCadidateid() != null ) {
            pcmYpzjkxx.setCadidateid( dto.getCadidateid() );
        }
        if ( dto.getApplicantid() != null ) {
            pcmYpzjkxx.setApplicantid( dto.getApplicantid() );
        }
        if ( dto.getTestresults() != null ) {
            pcmYpzjkxx.setTestresults( dto.getTestresults() );
        }
        if ( dto.getEducationexperience() != null ) {
            pcmYpzjkxx.setEducationexperience( dto.getEducationexperience() );
        }
        if ( dto.getPracticeexperience() != null ) {
            pcmYpzjkxx.setPracticeexperience( dto.getPracticeexperience() );
        }
        if ( dto.getPcmypzjkxxname() != null ) {
            pcmYpzjkxx.setPcmypzjkxxname( dto.getPcmypzjkxxname() );
        }
        if ( dto.getInterviewsummaries() != null ) {
            pcmYpzjkxx.setInterviewsummaries( dto.getInterviewsummaries() );
        }
        if ( dto.getSchooloffice() != null ) {
            pcmYpzjkxx.setSchooloffice( dto.getSchooloffice() );
        }
        if ( dto.getAwardswons() != null ) {
            pcmYpzjkxx.setAwardswons( dto.getAwardswons() );
        }
        if ( dto.getProfile() != null ) {
            pcmYpzjkxx.setProfile( dto.getProfile() );
        }
        if ( dto.getPcmypzjkxxid() != null ) {
            pcmYpzjkxx.setPcmypzjkxxid( dto.getPcmypzjkxxid() );
        }
        if ( dto.getCreateman() != null ) {
            pcmYpzjkxx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmYpzjkxx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmYpzjkxx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmYpzjkxx.setUpdateman( dto.getUpdateman() );
        }

        return pcmYpzjkxx;
    }

    @Override
    public PcmYpzjkxxDTO toDto(PcmYpzjkxx entity) {
        if ( entity == null ) {
            return null;
        }

        PcmYpzjkxxDTO pcmYpzjkxxDTO = new PcmYpzjkxxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmYpzjkxxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmYpzjkxxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getCadidateid() != null ) {
            pcmYpzjkxxDTO.setCadidateid( entity.getCadidateid() );
        }
        if ( entity.getApplicantid() != null ) {
            pcmYpzjkxxDTO.setApplicantid( entity.getApplicantid() );
        }
        if ( entity.getTestresults() != null ) {
            pcmYpzjkxxDTO.setTestresults( entity.getTestresults() );
        }
        if ( entity.getEducationexperience() != null ) {
            pcmYpzjkxxDTO.setEducationexperience( entity.getEducationexperience() );
        }
        if ( entity.getPracticeexperience() != null ) {
            pcmYpzjkxxDTO.setPracticeexperience( entity.getPracticeexperience() );
        }
        if ( entity.getPcmypzjkxxname() != null ) {
            pcmYpzjkxxDTO.setPcmypzjkxxname( entity.getPcmypzjkxxname() );
        }
        if ( entity.getInterviewsummaries() != null ) {
            pcmYpzjkxxDTO.setInterviewsummaries( entity.getInterviewsummaries() );
        }
        if ( entity.getSchooloffice() != null ) {
            pcmYpzjkxxDTO.setSchooloffice( entity.getSchooloffice() );
        }
        if ( entity.getAwardswons() != null ) {
            pcmYpzjkxxDTO.setAwardswons( entity.getAwardswons() );
        }
        if ( entity.getProfile() != null ) {
            pcmYpzjkxxDTO.setProfile( entity.getProfile() );
        }
        if ( entity.getPcmypzjkxxid() != null ) {
            pcmYpzjkxxDTO.setPcmypzjkxxid( entity.getPcmypzjkxxid() );
        }
        if ( entity.getCreateman() != null ) {
            pcmYpzjkxxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmYpzjkxxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmYpzjkxxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmYpzjkxxDTO.setUpdateman( entity.getUpdateman() );
        }

        return pcmYpzjkxxDTO;
    }

    @Override
    public List<PcmYpzjkxx> toDomain(List<PcmYpzjkxxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmYpzjkxx> list = new ArrayList<PcmYpzjkxx>( dtoList.size() );
        for ( PcmYpzjkxxDTO pcmYpzjkxxDTO : dtoList ) {
            list.add( toDomain( pcmYpzjkxxDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmYpzjkxxDTO> toDto(List<PcmYpzjkxx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmYpzjkxxDTO> list = new ArrayList<PcmYpzjkxxDTO>( entityList.size() );
        for ( PcmYpzjkxx pcmYpzjkxx : entityList ) {
            list.add( toDto( pcmYpzjkxx ) );
        }

        return list;
    }
}

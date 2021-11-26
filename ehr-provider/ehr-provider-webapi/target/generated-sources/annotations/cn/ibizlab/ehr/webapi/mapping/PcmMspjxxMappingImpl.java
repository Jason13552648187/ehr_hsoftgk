package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmMspjxx;
import cn.ibizlab.ehr.webapi.dto.PcmMspjxxDTO;
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
    date = "2021-09-04T00:31:51+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmMspjxxMappingImpl implements PcmMspjxxMapping {

    @Override
    public PcmMspjxx toDomain(PcmMspjxxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmMspjxx pcmMspjxx = new PcmMspjxx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmMspjxx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmMspjxx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getOfficer() != null ) {
            pcmMspjxx.setOfficer( dto.getOfficer() );
        }
        if ( dto.getInterviewtime() != null ) {
            pcmMspjxx.setInterviewtime( dto.getInterviewtime() );
        }
        if ( dto.getPcmmspjxxname() != null ) {
            pcmMspjxx.setPcmmspjxxname( dto.getPcmmspjxxname() );
        }
        if ( dto.getEvaluate() != null ) {
            pcmMspjxx.setEvaluate( dto.getEvaluate() );
        }
        if ( dto.getInterviewid() != null ) {
            pcmMspjxx.setInterviewid( dto.getInterviewid() );
        }
        if ( dto.getInterviewresultid() != null ) {
            pcmMspjxx.setInterviewresultid( dto.getInterviewresultid() );
        }
        if ( dto.getEvaluatetime() != null ) {
            pcmMspjxx.setEvaluatetime( dto.getEvaluatetime() );
        }
        if ( dto.getScore() != null ) {
            pcmMspjxx.setScore( dto.getScore() );
        }
        if ( dto.getConclusion() != null ) {
            pcmMspjxx.setConclusion( dto.getConclusion() );
        }
        if ( dto.getOfficeremail() != null ) {
            pcmMspjxx.setOfficeremail( dto.getOfficeremail() );
        }
        if ( dto.getLocation() != null ) {
            pcmMspjxx.setLocation( dto.getLocation() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmMspjxx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmMspjxx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pcmMspjxx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getPcmmspjxxid() != null ) {
            pcmMspjxx.setPcmmspjxxid( dto.getPcmmspjxxid() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmMspjxx.setUpdateman( dto.getUpdateman() );
        }

        return pcmMspjxx;
    }

    @Override
    public PcmMspjxxDTO toDto(PcmMspjxx entity) {
        if ( entity == null ) {
            return null;
        }

        PcmMspjxxDTO pcmMspjxxDTO = new PcmMspjxxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmMspjxxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmMspjxxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getOfficer() != null ) {
            pcmMspjxxDTO.setOfficer( entity.getOfficer() );
        }
        if ( entity.getInterviewtime() != null ) {
            pcmMspjxxDTO.setInterviewtime( entity.getInterviewtime() );
        }
        if ( entity.getPcmmspjxxname() != null ) {
            pcmMspjxxDTO.setPcmmspjxxname( entity.getPcmmspjxxname() );
        }
        if ( entity.getEvaluate() != null ) {
            pcmMspjxxDTO.setEvaluate( entity.getEvaluate() );
        }
        if ( entity.getInterviewid() != null ) {
            pcmMspjxxDTO.setInterviewid( entity.getInterviewid() );
        }
        if ( entity.getInterviewresultid() != null ) {
            pcmMspjxxDTO.setInterviewresultid( entity.getInterviewresultid() );
        }
        if ( entity.getEvaluatetime() != null ) {
            pcmMspjxxDTO.setEvaluatetime( entity.getEvaluatetime() );
        }
        if ( entity.getScore() != null ) {
            pcmMspjxxDTO.setScore( entity.getScore() );
        }
        if ( entity.getConclusion() != null ) {
            pcmMspjxxDTO.setConclusion( entity.getConclusion() );
        }
        if ( entity.getOfficeremail() != null ) {
            pcmMspjxxDTO.setOfficeremail( entity.getOfficeremail() );
        }
        if ( entity.getLocation() != null ) {
            pcmMspjxxDTO.setLocation( entity.getLocation() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmMspjxxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmMspjxxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pcmMspjxxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getPcmmspjxxid() != null ) {
            pcmMspjxxDTO.setPcmmspjxxid( entity.getPcmmspjxxid() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmMspjxxDTO.setUpdateman( entity.getUpdateman() );
        }

        return pcmMspjxxDTO;
    }

    @Override
    public List<PcmMspjxx> toDomain(List<PcmMspjxxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmMspjxx> list = new ArrayList<PcmMspjxx>( dtoList.size() );
        for ( PcmMspjxxDTO pcmMspjxxDTO : dtoList ) {
            list.add( toDomain( pcmMspjxxDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmMspjxxDTO> toDto(List<PcmMspjxx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmMspjxxDTO> list = new ArrayList<PcmMspjxxDTO>( entityList.size() );
        for ( PcmMspjxx pcmMspjxx : entityList ) {
            list.add( toDto( pcmMspjxx ) );
        }

        return list;
    }
}

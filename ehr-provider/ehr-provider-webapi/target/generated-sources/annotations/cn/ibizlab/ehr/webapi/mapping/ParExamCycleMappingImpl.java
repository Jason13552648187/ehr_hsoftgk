package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParExamCycle;
import cn.ibizlab.ehr.webapi.dto.ParExamCycleDTO;
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
    date = "2021-09-04T00:31:53+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class ParExamCycleMappingImpl implements ParExamCycleMapping {

    @Override
    public ParExamCycle toDomain(ParExamCycleDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParExamCycle parExamCycle = new ParExamCycle();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parExamCycle.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parExamCycle.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getParexamcyclename() != null ) {
            parExamCycle.setParexamcyclename( dto.getParexamcyclename() );
        }
        if ( dto.getCycleid() != null ) {
            parExamCycle.setCycleid( dto.getCycleid() );
        }
        if ( dto.getParexamcycleid() != null ) {
            parExamCycle.setParexamcycleid( dto.getParexamcycleid() );
        }
        if ( dto.getCreateman() != null ) {
            parExamCycle.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            parExamCycle.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            parExamCycle.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            parExamCycle.setUpdatedate( dto.getUpdatedate() );
        }

        return parExamCycle;
    }

    @Override
    public ParExamCycleDTO toDto(ParExamCycle entity) {
        if ( entity == null ) {
            return null;
        }

        ParExamCycleDTO parExamCycleDTO = new ParExamCycleDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parExamCycleDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parExamCycleDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getParexamcyclename() != null ) {
            parExamCycleDTO.setParexamcyclename( entity.getParexamcyclename() );
        }
        if ( entity.getCycleid() != null ) {
            parExamCycleDTO.setCycleid( entity.getCycleid() );
        }
        if ( entity.getParexamcycleid() != null ) {
            parExamCycleDTO.setParexamcycleid( entity.getParexamcycleid() );
        }
        if ( entity.getCreateman() != null ) {
            parExamCycleDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            parExamCycleDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            parExamCycleDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            parExamCycleDTO.setUpdatedate( entity.getUpdatedate() );
        }

        return parExamCycleDTO;
    }

    @Override
    public List<ParExamCycle> toDomain(List<ParExamCycleDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParExamCycle> list = new ArrayList<ParExamCycle>( dtoList.size() );
        for ( ParExamCycleDTO parExamCycleDTO : dtoList ) {
            list.add( toDomain( parExamCycleDTO ) );
        }

        return list;
    }

    @Override
    public List<ParExamCycleDTO> toDto(List<ParExamCycle> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParExamCycleDTO> list = new ArrayList<ParExamCycleDTO>( entityList.size() );
        for ( ParExamCycle parExamCycle : entityList ) {
            list.add( toDto( parExamCycle ) );
        }

        return list;
    }
}

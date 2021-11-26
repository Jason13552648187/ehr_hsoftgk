package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParDjbz;
import cn.ibizlab.ehr.webapi.dto.ParDjbzDTO;
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
    date = "2021-09-04T00:31:49+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class ParDjbzMappingImpl implements ParDjbzMapping {

    @Override
    public ParDjbz toDomain(ParDjbzDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParDjbz parDjbz = new ParDjbz();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parDjbz.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parDjbz.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getKhpgdj() != null ) {
            parDjbz.setKhpgdj( dto.getKhpgdj() );
        }
        if ( dto.getPardjbzname() != null ) {
            parDjbz.setPardjbzname( dto.getPardjbzname() );
        }
        if ( dto.getFbbl() != null ) {
            parDjbz.setFbbl( dto.getFbbl() );
        }
        if ( dto.getCreatedate() != null ) {
            parDjbz.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            parDjbz.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            parDjbz.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPardjbzid() != null ) {
            parDjbz.setPardjbzid( dto.getPardjbzid() );
        }
        if ( dto.getUpdateman() != null ) {
            parDjbz.setUpdateman( dto.getUpdateman() );
        }

        return parDjbz;
    }

    @Override
    public ParDjbzDTO toDto(ParDjbz entity) {
        if ( entity == null ) {
            return null;
        }

        ParDjbzDTO parDjbzDTO = new ParDjbzDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parDjbzDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parDjbzDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getKhpgdj() != null ) {
            parDjbzDTO.setKhpgdj( entity.getKhpgdj() );
        }
        if ( entity.getPardjbzname() != null ) {
            parDjbzDTO.setPardjbzname( entity.getPardjbzname() );
        }
        if ( entity.getFbbl() != null ) {
            parDjbzDTO.setFbbl( entity.getFbbl() );
        }
        if ( entity.getCreatedate() != null ) {
            parDjbzDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            parDjbzDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            parDjbzDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPardjbzid() != null ) {
            parDjbzDTO.setPardjbzid( entity.getPardjbzid() );
        }
        if ( entity.getUpdateman() != null ) {
            parDjbzDTO.setUpdateman( entity.getUpdateman() );
        }

        return parDjbzDTO;
    }

    @Override
    public List<ParDjbz> toDomain(List<ParDjbzDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParDjbz> list = new ArrayList<ParDjbz>( dtoList.size() );
        for ( ParDjbzDTO parDjbzDTO : dtoList ) {
            list.add( toDomain( parDjbzDTO ) );
        }

        return list;
    }

    @Override
    public List<ParDjbzDTO> toDto(List<ParDjbz> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParDjbzDTO> list = new ArrayList<ParDjbzDTO>( entityList.size() );
        for ( ParDjbz parDjbz : entityList ) {
            list.add( toDto( parDjbz ) );
        }

        return list;
    }
}

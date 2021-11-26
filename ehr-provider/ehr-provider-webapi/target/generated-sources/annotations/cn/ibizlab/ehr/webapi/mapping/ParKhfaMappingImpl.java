package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParKhfa;
import cn.ibizlab.ehr.webapi.dto.ParKhfaDTO;
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
public class ParKhfaMappingImpl implements ParKhfaMapping {

    @Override
    public ParKhfa toDomain(ParKhfaDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParKhfa parKhfa = new ParKhfa();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parKhfa.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parKhfa.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSzsj() != null ) {
            parKhfa.setSzsj( dto.getSzsj() );
        }
        if ( dto.getXh() != null ) {
            parKhfa.setXh( dto.getXh() );
        }
        if ( dto.getParkhfaname() != null ) {
            parKhfa.setParkhfaname( dto.getParkhfaname() );
        }
        if ( dto.getKhdx() != null ) {
            parKhfa.setKhdx( dto.getKhdx() );
        }
        if ( dto.getAvailableflag() != null ) {
            parKhfa.setAvailableflag( dto.getAvailableflag() );
        }
        if ( dto.getUpdatedate() != null ) {
            parKhfa.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            parKhfa.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            parKhfa.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getParkhfaid() != null ) {
            parKhfa.setParkhfaid( dto.getParkhfaid() );
        }
        if ( dto.getCreateman() != null ) {
            parKhfa.setCreateman( dto.getCreateman() );
        }

        return parKhfa;
    }

    @Override
    public ParKhfaDTO toDto(ParKhfa entity) {
        if ( entity == null ) {
            return null;
        }

        ParKhfaDTO parKhfaDTO = new ParKhfaDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parKhfaDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parKhfaDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSzsj() != null ) {
            parKhfaDTO.setSzsj( entity.getSzsj() );
        }
        if ( entity.getXh() != null ) {
            parKhfaDTO.setXh( entity.getXh() );
        }
        if ( entity.getParkhfaname() != null ) {
            parKhfaDTO.setParkhfaname( entity.getParkhfaname() );
        }
        if ( entity.getKhdx() != null ) {
            parKhfaDTO.setKhdx( entity.getKhdx() );
        }
        if ( entity.getAvailableflag() != null ) {
            parKhfaDTO.setAvailableflag( entity.getAvailableflag() );
        }
        if ( entity.getUpdatedate() != null ) {
            parKhfaDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            parKhfaDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            parKhfaDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getParkhfaid() != null ) {
            parKhfaDTO.setParkhfaid( entity.getParkhfaid() );
        }
        if ( entity.getCreateman() != null ) {
            parKhfaDTO.setCreateman( entity.getCreateman() );
        }

        return parKhfaDTO;
    }

    @Override
    public List<ParKhfa> toDomain(List<ParKhfaDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParKhfa> list = new ArrayList<ParKhfa>( dtoList.size() );
        for ( ParKhfaDTO parKhfaDTO : dtoList ) {
            list.add( toDomain( parKhfaDTO ) );
        }

        return list;
    }

    @Override
    public List<ParKhfaDTO> toDto(List<ParKhfa> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParKhfaDTO> list = new ArrayList<ParKhfaDTO>( entityList.size() );
        for ( ParKhfa parKhfa : entityList ) {
            list.add( toDto( parKhfa ) );
        }

        return list;
    }
}

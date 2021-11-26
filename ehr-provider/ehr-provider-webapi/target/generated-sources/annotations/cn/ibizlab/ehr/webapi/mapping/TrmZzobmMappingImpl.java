package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmZzobm;
import cn.ibizlab.ehr.webapi.dto.TrmZzobmDTO;
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
public class TrmZzobmMappingImpl implements TrmZzobmMapping {

    @Override
    public TrmZzobm toDomain(TrmZzobmDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmZzobm trmZzobm = new TrmZzobm();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmZzobm.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmZzobm.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getLx() != null ) {
            trmZzobm.setLx( dto.getLx() );
        }
        if ( dto.getTrmzzobmname() != null ) {
            trmZzobm.setTrmzzobmname( dto.getTrmzzobmname() );
        }
        if ( dto.getBm() != null ) {
            trmZzobm.setBm( dto.getBm() );
        }
        if ( dto.getSjdwid() != null ) {
            trmZzobm.setSjdwid( dto.getSjdwid() );
        }
        if ( dto.getDw() != null ) {
            trmZzobm.setDw( dto.getDw() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmZzobm.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            trmZzobm.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            trmZzobm.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getEnable() != null ) {
            trmZzobm.setEnable( dto.getEnable() );
        }
        if ( dto.getTrmzzobmid() != null ) {
            trmZzobm.setTrmzzobmid( dto.getTrmzzobmid() );
        }
        if ( dto.getCreateman() != null ) {
            trmZzobm.setCreateman( dto.getCreateman() );
        }

        return trmZzobm;
    }

    @Override
    public TrmZzobmDTO toDto(TrmZzobm entity) {
        if ( entity == null ) {
            return null;
        }

        TrmZzobmDTO trmZzobmDTO = new TrmZzobmDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmZzobmDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmZzobmDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getLx() != null ) {
            trmZzobmDTO.setLx( entity.getLx() );
        }
        if ( entity.getTrmzzobmname() != null ) {
            trmZzobmDTO.setTrmzzobmname( entity.getTrmzzobmname() );
        }
        if ( entity.getBm() != null ) {
            trmZzobmDTO.setBm( entity.getBm() );
        }
        if ( entity.getSjdwid() != null ) {
            trmZzobmDTO.setSjdwid( entity.getSjdwid() );
        }
        if ( entity.getDw() != null ) {
            trmZzobmDTO.setDw( entity.getDw() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmZzobmDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            trmZzobmDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            trmZzobmDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getEnable() != null ) {
            trmZzobmDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getTrmzzobmid() != null ) {
            trmZzobmDTO.setTrmzzobmid( entity.getTrmzzobmid() );
        }
        if ( entity.getCreateman() != null ) {
            trmZzobmDTO.setCreateman( entity.getCreateman() );
        }

        return trmZzobmDTO;
    }

    @Override
    public List<TrmZzobm> toDomain(List<TrmZzobmDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmZzobm> list = new ArrayList<TrmZzobm>( dtoList.size() );
        for ( TrmZzobmDTO trmZzobmDTO : dtoList ) {
            list.add( toDomain( trmZzobmDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmZzobmDTO> toDto(List<TrmZzobm> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmZzobmDTO> list = new ArrayList<TrmZzobmDTO>( entityList.size() );
        for ( TrmZzobm trmZzobm : entityList ) {
            list.add( toDto( trmZzobm ) );
        }

        return list;
    }
}

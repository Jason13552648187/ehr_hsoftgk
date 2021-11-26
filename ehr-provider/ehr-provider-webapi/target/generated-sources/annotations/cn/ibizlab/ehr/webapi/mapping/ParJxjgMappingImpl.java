package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParJxjg;
import cn.ibizlab.ehr.webapi.dto.ParJxjgDTO;
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
    date = "2021-09-04T00:31:55+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class ParJxjgMappingImpl implements ParJxjgMapping {

    @Override
    public ParJxjg toDomain(ParJxjgDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParJxjg parJxjg = new ParJxjg();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parJxjg.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parJxjg.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPm() != null ) {
            parJxjg.setPm( dto.getPm() );
        }
        if ( dto.getBm() != null ) {
            parJxjg.setBm( dto.getBm() );
        }
        if ( dto.getKhpgdj() != null ) {
            parJxjg.setKhpgdj( dto.getKhpgdj() );
        }
        if ( dto.getParjxjgname() != null ) {
            parJxjg.setParjxjgname( dto.getParjxjgname() );
        }
        if ( dto.getYg() != null ) {
            parJxjg.setYg( dto.getYg() );
        }
        if ( dto.getNd() != null ) {
            parJxjg.setNd( dto.getNd() );
        }
        if ( dto.getKhlx() != null ) {
            parJxjg.setKhlx( dto.getKhlx() );
        }
        if ( dto.getYgid() != null ) {
            parJxjg.setYgid( dto.getYgid() );
        }
        if ( dto.getZf() != null ) {
            parJxjg.setZf( dto.getZf() );
        }
        if ( dto.getZz() != null ) {
            parJxjg.setZz( dto.getZz() );
        }
        if ( dto.getUpdatedate() != null ) {
            parJxjg.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getParjxjgid() != null ) {
            parJxjg.setParjxjgid( dto.getParjxjgid() );
        }
        if ( dto.getCreateman() != null ) {
            parJxjg.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            parJxjg.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            parJxjg.setCreatedate( dto.getCreatedate() );
        }

        return parJxjg;
    }

    @Override
    public ParJxjgDTO toDto(ParJxjg entity) {
        if ( entity == null ) {
            return null;
        }

        ParJxjgDTO parJxjgDTO = new ParJxjgDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parJxjgDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parJxjgDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPm() != null ) {
            parJxjgDTO.setPm( entity.getPm() );
        }
        if ( entity.getBm() != null ) {
            parJxjgDTO.setBm( entity.getBm() );
        }
        if ( entity.getKhpgdj() != null ) {
            parJxjgDTO.setKhpgdj( entity.getKhpgdj() );
        }
        if ( entity.getParjxjgname() != null ) {
            parJxjgDTO.setParjxjgname( entity.getParjxjgname() );
        }
        if ( entity.getYg() != null ) {
            parJxjgDTO.setYg( entity.getYg() );
        }
        if ( entity.getNd() != null ) {
            parJxjgDTO.setNd( entity.getNd() );
        }
        if ( entity.getKhlx() != null ) {
            parJxjgDTO.setKhlx( entity.getKhlx() );
        }
        if ( entity.getYgid() != null ) {
            parJxjgDTO.setYgid( entity.getYgid() );
        }
        if ( entity.getZf() != null ) {
            parJxjgDTO.setZf( entity.getZf() );
        }
        if ( entity.getZz() != null ) {
            parJxjgDTO.setZz( entity.getZz() );
        }
        if ( entity.getUpdatedate() != null ) {
            parJxjgDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getParjxjgid() != null ) {
            parJxjgDTO.setParjxjgid( entity.getParjxjgid() );
        }
        if ( entity.getCreateman() != null ) {
            parJxjgDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            parJxjgDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            parJxjgDTO.setCreatedate( entity.getCreatedate() );
        }

        return parJxjgDTO;
    }

    @Override
    public List<ParJxjg> toDomain(List<ParJxjgDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParJxjg> list = new ArrayList<ParJxjg>( dtoList.size() );
        for ( ParJxjgDTO parJxjgDTO : dtoList ) {
            list.add( toDomain( parJxjgDTO ) );
        }

        return list;
    }

    @Override
    public List<ParJxjgDTO> toDto(List<ParJxjg> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParJxjgDTO> list = new ArrayList<ParJxjgDTO>( entityList.size() );
        for ( ParJxjg parJxjg : entityList ) {
            list.add( toDto( parJxjg ) );
        }

        return list;
    }
}

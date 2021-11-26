package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParJxndkhjg;
import cn.ibizlab.ehr.webapi.dto.ParJxndkhjgDTO;
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
public class ParJxndkhjgMappingImpl implements ParJxndkhjgMapping {

    @Override
    public ParJxndkhjg toDomain(ParJxndkhjgDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParJxndkhjg parJxndkhjg = new ParJxndkhjg();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parJxndkhjg.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parJxndkhjg.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getKhnd() != null ) {
            parJxndkhjg.setKhnd( dto.getKhnd() );
        }
        if ( dto.getKhzq() != null ) {
            parJxndkhjg.setKhzq( dto.getKhzq() );
        }
        if ( dto.getKhpgdj() != null ) {
            parJxndkhjg.setKhpgdj( dto.getKhpgdj() );
        }
        if ( dto.getPm() != null ) {
            parJxndkhjg.setPm( dto.getPm() );
        }
        if ( dto.getParjxndkhjgname() != null ) {
            parJxndkhjg.setParjxndkhjgname( dto.getParjxndkhjgname() );
        }
        if ( dto.getSftx() != null ) {
            parJxndkhjg.setSftx( dto.getSftx() );
        }
        if ( dto.getZf() != null ) {
            parJxndkhjg.setZf( dto.getZf() );
        }
        if ( dto.getPimpersonid() != null ) {
            parJxndkhjg.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getCreateman() != null ) {
            parJxndkhjg.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            parJxndkhjg.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            parJxndkhjg.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getParjxndkhjgid() != null ) {
            parJxndkhjg.setParjxndkhjgid( dto.getParjxndkhjgid() );
        }
        if ( dto.getCreatedate() != null ) {
            parJxndkhjg.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getPimpersonname() != null ) {
            parJxndkhjg.setPimpersonname( dto.getPimpersonname() );
        }

        return parJxndkhjg;
    }

    @Override
    public ParJxndkhjgDTO toDto(ParJxndkhjg entity) {
        if ( entity == null ) {
            return null;
        }

        ParJxndkhjgDTO parJxndkhjgDTO = new ParJxndkhjgDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parJxndkhjgDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parJxndkhjgDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getKhnd() != null ) {
            parJxndkhjgDTO.setKhnd( entity.getKhnd() );
        }
        if ( entity.getKhzq() != null ) {
            parJxndkhjgDTO.setKhzq( entity.getKhzq() );
        }
        if ( entity.getKhpgdj() != null ) {
            parJxndkhjgDTO.setKhpgdj( entity.getKhpgdj() );
        }
        if ( entity.getPm() != null ) {
            parJxndkhjgDTO.setPm( entity.getPm() );
        }
        if ( entity.getParjxndkhjgname() != null ) {
            parJxndkhjgDTO.setParjxndkhjgname( entity.getParjxndkhjgname() );
        }
        if ( entity.getSftx() != null ) {
            parJxndkhjgDTO.setSftx( entity.getSftx() );
        }
        if ( entity.getZf() != null ) {
            parJxndkhjgDTO.setZf( entity.getZf() );
        }
        if ( entity.getPimpersonid() != null ) {
            parJxndkhjgDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getCreateman() != null ) {
            parJxndkhjgDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            parJxndkhjgDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            parJxndkhjgDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getParjxndkhjgid() != null ) {
            parJxndkhjgDTO.setParjxndkhjgid( entity.getParjxndkhjgid() );
        }
        if ( entity.getCreatedate() != null ) {
            parJxndkhjgDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getPimpersonname() != null ) {
            parJxndkhjgDTO.setPimpersonname( entity.getPimpersonname() );
        }

        return parJxndkhjgDTO;
    }

    @Override
    public List<ParJxndkhjg> toDomain(List<ParJxndkhjgDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParJxndkhjg> list = new ArrayList<ParJxndkhjg>( dtoList.size() );
        for ( ParJxndkhjgDTO parJxndkhjgDTO : dtoList ) {
            list.add( toDomain( parJxndkhjgDTO ) );
        }

        return list;
    }

    @Override
    public List<ParJxndkhjgDTO> toDto(List<ParJxndkhjg> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParJxndkhjgDTO> list = new ArrayList<ParJxndkhjgDTO>( entityList.size() );
        for ( ParJxndkhjg parJxndkhjg : entityList ) {
            list.add( toDto( parJxndkhjg ) );
        }

        return list;
    }
}

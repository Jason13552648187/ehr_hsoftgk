package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParJxkhxhz;
import cn.ibizlab.ehr.webapi.dto.ParJxkhxhzDTO;
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
    date = "2021-09-04T00:31:45+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class ParJxkhxhzMappingImpl implements ParJxkhxhzMapping {

    @Override
    public ParJxkhxhz toDomain(ParJxkhxhzDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParJxkhxhz parJxkhxhz = new ParJxkhxhz();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parJxkhxhz.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parJxkhxhz.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getXh() != null ) {
            parJxkhxhz.setXh( dto.getXh() );
        }
        if ( dto.getJswmjc() != null ) {
            parJxkhxhz.setJswmjc( dto.getJswmjc() );
        }
        if ( dto.getSzmzpy() != null ) {
            parJxkhxhz.setSzmzpy( dto.getSzmzpy() );
        }
        if ( dto.getKhlx() != null ) {
            parJxkhxhz.setKhlx( dto.getKhlx() );
        }
        if ( dto.getYwnlks() != null ) {
            parJxkhxhz.setYwnlks( dto.getYwnlks() );
        }
        if ( dto.getParjxkhxhzname() != null ) {
            parJxkhxhz.setParjxkhxhzname( dto.getParjxkhxhzname() );
        }
        if ( dto.getZz() != null ) {
            parJxkhxhz.setZz( dto.getZz() );
        }
        if ( dto.getYgid() != null ) {
            parJxkhxhz.setYgid( dto.getYgid() );
        }
        if ( dto.getGznljtd() != null ) {
            parJxkhxhz.setGznljtd( dto.getGznljtd() );
        }
        if ( dto.getGznljtdXbn() != null ) {
            parJxkhxhz.setGznljtdXbn( dto.getGznljtdXbn() );
        }
        if ( dto.getGzjx() != null ) {
            parJxkhxhz.setGzjx( dto.getGzjx() );
        }
        if ( dto.getYg() != null ) {
            parJxkhxhz.setYg( dto.getYg() );
        }
        if ( dto.getBm() != null ) {
            parJxkhxhz.setBm( dto.getBm() );
        }
        if ( dto.getParassesstemplateid() != null ) {
            parJxkhxhz.setParassesstemplateid( dto.getParassesstemplateid() );
        }
        if ( dto.getNd() != null ) {
            parJxkhxhz.setNd( dto.getNd() );
        }
        if ( dto.getUpdatedate() != null ) {
            parJxkhxhz.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            parJxkhxhz.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            parJxkhxhz.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            parJxkhxhz.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getParjxkhxhzid() != null ) {
            parJxkhxhz.setParjxkhxhzid( dto.getParjxkhxhzid() );
        }
        if ( dto.getParassesstemplatename() != null ) {
            parJxkhxhz.setParassesstemplatename( dto.getParassesstemplatename() );
        }

        return parJxkhxhz;
    }

    @Override
    public ParJxkhxhzDTO toDto(ParJxkhxhz entity) {
        if ( entity == null ) {
            return null;
        }

        ParJxkhxhzDTO parJxkhxhzDTO = new ParJxkhxhzDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parJxkhxhzDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parJxkhxhzDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getXh() != null ) {
            parJxkhxhzDTO.setXh( entity.getXh() );
        }
        if ( entity.getJswmjc() != null ) {
            parJxkhxhzDTO.setJswmjc( entity.getJswmjc() );
        }
        if ( entity.getSzmzpy() != null ) {
            parJxkhxhzDTO.setSzmzpy( entity.getSzmzpy() );
        }
        if ( entity.getKhlx() != null ) {
            parJxkhxhzDTO.setKhlx( entity.getKhlx() );
        }
        if ( entity.getYwnlks() != null ) {
            parJxkhxhzDTO.setYwnlks( entity.getYwnlks() );
        }
        if ( entity.getParjxkhxhzname() != null ) {
            parJxkhxhzDTO.setParjxkhxhzname( entity.getParjxkhxhzname() );
        }
        if ( entity.getZz() != null ) {
            parJxkhxhzDTO.setZz( entity.getZz() );
        }
        if ( entity.getYgid() != null ) {
            parJxkhxhzDTO.setYgid( entity.getYgid() );
        }
        if ( entity.getGznljtd() != null ) {
            parJxkhxhzDTO.setGznljtd( entity.getGznljtd() );
        }
        if ( entity.getGznljtdXbn() != null ) {
            parJxkhxhzDTO.setGznljtdXbn( entity.getGznljtdXbn() );
        }
        if ( entity.getGzjx() != null ) {
            parJxkhxhzDTO.setGzjx( entity.getGzjx() );
        }
        if ( entity.getYg() != null ) {
            parJxkhxhzDTO.setYg( entity.getYg() );
        }
        if ( entity.getBm() != null ) {
            parJxkhxhzDTO.setBm( entity.getBm() );
        }
        if ( entity.getParassesstemplateid() != null ) {
            parJxkhxhzDTO.setParassesstemplateid( entity.getParassesstemplateid() );
        }
        if ( entity.getNd() != null ) {
            parJxkhxhzDTO.setNd( entity.getNd() );
        }
        if ( entity.getUpdatedate() != null ) {
            parJxkhxhzDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            parJxkhxhzDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            parJxkhxhzDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            parJxkhxhzDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getParjxkhxhzid() != null ) {
            parJxkhxhzDTO.setParjxkhxhzid( entity.getParjxkhxhzid() );
        }
        if ( entity.getParassesstemplatename() != null ) {
            parJxkhxhzDTO.setParassesstemplatename( entity.getParassesstemplatename() );
        }

        return parJxkhxhzDTO;
    }

    @Override
    public List<ParJxkhxhz> toDomain(List<ParJxkhxhzDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParJxkhxhz> list = new ArrayList<ParJxkhxhz>( dtoList.size() );
        for ( ParJxkhxhzDTO parJxkhxhzDTO : dtoList ) {
            list.add( toDomain( parJxkhxhzDTO ) );
        }

        return list;
    }

    @Override
    public List<ParJxkhxhzDTO> toDto(List<ParJxkhxhz> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParJxkhxhzDTO> list = new ArrayList<ParJxkhxhzDTO>( entityList.size() );
        for ( ParJxkhxhz parJxkhxhz : entityList ) {
            list.add( toDto( parJxkhxhz ) );
        }

        return list;
    }
}

package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParKhzcmx;
import cn.ibizlab.ehr.webapi.dto.ParKhzcmxDTO;
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
    date = "2021-09-04T00:31:46+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class ParKhzcmxMappingImpl implements ParKhzcmxMapping {

    @Override
    public ParKhzcmx toDomain(ParKhzcmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParKhzcmx parKhzcmx = new ParKhzcmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parKhzcmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parKhzcmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSzqz() != null ) {
            parKhzcmx.setSzqz( dto.getSzqz() );
        }
        if ( dto.getSfqy() != null ) {
            parKhzcmx.setSfqy( dto.getSfqy() );
        }
        if ( dto.getParkhzcmxname() != null ) {
            parKhzcmx.setParkhzcmxname( dto.getParkhzcmxname() );
        }
        if ( dto.getParjxkhjcszid() != null ) {
            parKhzcmx.setParjxkhjcszid( dto.getParjxkhjcszid() );
        }
        if ( dto.getParassesstemplateid() != null ) {
            parKhzcmx.setParassesstemplateid( dto.getParassesstemplateid() );
        }
        if ( dto.getKhnr() != null ) {
            parKhzcmx.setKhnr( dto.getKhnr() );
        }
        if ( dto.getXh() != null ) {
            parKhzcmx.setXh( dto.getXh() );
        }
        if ( dto.getParkhzcmxid() != null ) {
            parKhzcmx.setParkhzcmxid( dto.getParkhzcmxid() );
        }
        if ( dto.getCreateman() != null ) {
            parKhzcmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            parKhzcmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            parKhzcmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            parKhzcmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getKhdx() != null ) {
            parKhzcmx.setKhdx( dto.getKhdx() );
        }
        if ( dto.getParjxkhjcszname() != null ) {
            parKhzcmx.setParjxkhjcszname( dto.getParjxkhjcszname() );
        }
        if ( dto.getParassesstemplatename() != null ) {
            parKhzcmx.setParassesstemplatename( dto.getParassesstemplatename() );
        }

        return parKhzcmx;
    }

    @Override
    public ParKhzcmxDTO toDto(ParKhzcmx entity) {
        if ( entity == null ) {
            return null;
        }

        ParKhzcmxDTO parKhzcmxDTO = new ParKhzcmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parKhzcmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parKhzcmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSzqz() != null ) {
            parKhzcmxDTO.setSzqz( entity.getSzqz() );
        }
        if ( entity.getSfqy() != null ) {
            parKhzcmxDTO.setSfqy( entity.getSfqy() );
        }
        if ( entity.getParkhzcmxname() != null ) {
            parKhzcmxDTO.setParkhzcmxname( entity.getParkhzcmxname() );
        }
        if ( entity.getParjxkhjcszid() != null ) {
            parKhzcmxDTO.setParjxkhjcszid( entity.getParjxkhjcszid() );
        }
        if ( entity.getParassesstemplateid() != null ) {
            parKhzcmxDTO.setParassesstemplateid( entity.getParassesstemplateid() );
        }
        if ( entity.getKhnr() != null ) {
            parKhzcmxDTO.setKhnr( entity.getKhnr() );
        }
        if ( entity.getXh() != null ) {
            parKhzcmxDTO.setXh( entity.getXh() );
        }
        if ( entity.getParkhzcmxid() != null ) {
            parKhzcmxDTO.setParkhzcmxid( entity.getParkhzcmxid() );
        }
        if ( entity.getCreateman() != null ) {
            parKhzcmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            parKhzcmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            parKhzcmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            parKhzcmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getKhdx() != null ) {
            parKhzcmxDTO.setKhdx( entity.getKhdx() );
        }
        if ( entity.getParjxkhjcszname() != null ) {
            parKhzcmxDTO.setParjxkhjcszname( entity.getParjxkhjcszname() );
        }
        if ( entity.getParassesstemplatename() != null ) {
            parKhzcmxDTO.setParassesstemplatename( entity.getParassesstemplatename() );
        }

        return parKhzcmxDTO;
    }

    @Override
    public List<ParKhzcmx> toDomain(List<ParKhzcmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParKhzcmx> list = new ArrayList<ParKhzcmx>( dtoList.size() );
        for ( ParKhzcmxDTO parKhzcmxDTO : dtoList ) {
            list.add( toDomain( parKhzcmxDTO ) );
        }

        return list;
    }

    @Override
    public List<ParKhzcmxDTO> toDto(List<ParKhzcmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParKhzcmxDTO> list = new ArrayList<ParKhzcmxDTO>( entityList.size() );
        for ( ParKhzcmx parKhzcmx : entityList ) {
            list.add( toDto( parKhzcmx ) );
        }

        return list;
    }
}

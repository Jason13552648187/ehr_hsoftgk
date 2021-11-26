package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParDxkhnrmx;
import cn.ibizlab.ehr.webapi.dto.ParDxkhnrmxDTO;
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
public class ParDxkhnrmxMappingImpl implements ParDxkhnrmxMapping {

    @Override
    public ParDxkhnrmx toDomain(ParDxkhnrmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParDxkhnrmx parDxkhnrmx = new ParDxkhnrmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parDxkhnrmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parDxkhnrmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getZq() != null ) {
            parDxkhnrmx.setZq( dto.getZq() );
        }
        if ( dto.getPardxkhnrmxname() != null ) {
            parDxkhnrmx.setPardxkhnrmxname( dto.getPardxkhnrmxname() );
        }
        if ( dto.getKhdf() != null ) {
            parDxkhnrmx.setKhdf( dto.getKhdf() );
        }
        if ( dto.getPfzt() != null ) {
            parDxkhnrmx.setPfzt( dto.getPfzt() );
        }
        if ( dto.getNd() != null ) {
            parDxkhnrmx.setNd( dto.getNd() );
        }
        if ( dto.getPimpersonid() != null ) {
            parDxkhnrmx.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getParkhzcmxid() != null ) {
            parDxkhnrmx.setParkhzcmxid( dto.getParkhzcmxid() );
        }
        if ( dto.getUpdateman() != null ) {
            parDxkhnrmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPardxkhnrmxid() != null ) {
            parDxkhnrmx.setPardxkhnrmxid( dto.getPardxkhnrmxid() );
        }
        if ( dto.getCreatedate() != null ) {
            parDxkhnrmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            parDxkhnrmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            parDxkhnrmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getZz() != null ) {
            parDxkhnrmx.setZz( dto.getZz() );
        }
        if ( dto.getZjhm() != null ) {
            parDxkhnrmx.setZjhm( dto.getZjhm() );
        }
        if ( dto.getBm() != null ) {
            parDxkhnrmx.setBm( dto.getBm() );
        }
        if ( dto.getParkhzcmxname() != null ) {
            parDxkhnrmx.setParkhzcmxname( dto.getParkhzcmxname() );
        }
        if ( dto.getKhdx() != null ) {
            parDxkhnrmx.setKhdx( dto.getKhdx() );
        }
        if ( dto.getPimpersonname() != null ) {
            parDxkhnrmx.setPimpersonname( dto.getPimpersonname() );
        }

        return parDxkhnrmx;
    }

    @Override
    public ParDxkhnrmxDTO toDto(ParDxkhnrmx entity) {
        if ( entity == null ) {
            return null;
        }

        ParDxkhnrmxDTO parDxkhnrmxDTO = new ParDxkhnrmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parDxkhnrmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parDxkhnrmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getZq() != null ) {
            parDxkhnrmxDTO.setZq( entity.getZq() );
        }
        if ( entity.getPardxkhnrmxname() != null ) {
            parDxkhnrmxDTO.setPardxkhnrmxname( entity.getPardxkhnrmxname() );
        }
        if ( entity.getKhdf() != null ) {
            parDxkhnrmxDTO.setKhdf( entity.getKhdf() );
        }
        if ( entity.getPfzt() != null ) {
            parDxkhnrmxDTO.setPfzt( entity.getPfzt() );
        }
        if ( entity.getNd() != null ) {
            parDxkhnrmxDTO.setNd( entity.getNd() );
        }
        if ( entity.getPimpersonid() != null ) {
            parDxkhnrmxDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getParkhzcmxid() != null ) {
            parDxkhnrmxDTO.setParkhzcmxid( entity.getParkhzcmxid() );
        }
        if ( entity.getUpdateman() != null ) {
            parDxkhnrmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPardxkhnrmxid() != null ) {
            parDxkhnrmxDTO.setPardxkhnrmxid( entity.getPardxkhnrmxid() );
        }
        if ( entity.getCreatedate() != null ) {
            parDxkhnrmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            parDxkhnrmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            parDxkhnrmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getZz() != null ) {
            parDxkhnrmxDTO.setZz( entity.getZz() );
        }
        if ( entity.getZjhm() != null ) {
            parDxkhnrmxDTO.setZjhm( entity.getZjhm() );
        }
        if ( entity.getBm() != null ) {
            parDxkhnrmxDTO.setBm( entity.getBm() );
        }
        if ( entity.getParkhzcmxname() != null ) {
            parDxkhnrmxDTO.setParkhzcmxname( entity.getParkhzcmxname() );
        }
        if ( entity.getKhdx() != null ) {
            parDxkhnrmxDTO.setKhdx( entity.getKhdx() );
        }
        if ( entity.getPimpersonname() != null ) {
            parDxkhnrmxDTO.setPimpersonname( entity.getPimpersonname() );
        }

        return parDxkhnrmxDTO;
    }

    @Override
    public List<ParDxkhnrmx> toDomain(List<ParDxkhnrmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParDxkhnrmx> list = new ArrayList<ParDxkhnrmx>( dtoList.size() );
        for ( ParDxkhnrmxDTO parDxkhnrmxDTO : dtoList ) {
            list.add( toDomain( parDxkhnrmxDTO ) );
        }

        return list;
    }

    @Override
    public List<ParDxkhnrmxDTO> toDto(List<ParDxkhnrmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParDxkhnrmxDTO> list = new ArrayList<ParDxkhnrmxDTO>( entityList.size() );
        for ( ParDxkhnrmx parDxkhnrmx : entityList ) {
            list.add( toDto( parDxkhnrmx ) );
        }

        return list;
    }
}

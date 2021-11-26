package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmPlanFormu;
import cn.ibizlab.ehr.webapi.dto.TrmPlanFormuDTO;
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
public class TrmPlanFormuMappingImpl implements TrmPlanFormuMapping {

    @Override
    public TrmPlanFormu toDomain(TrmPlanFormuDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmPlanFormu trmPlanFormu = new TrmPlanFormu();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmPlanFormu.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmPlanFormu.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getBzsj() != null ) {
            trmPlanFormu.setBzsj( dto.getBzsj() );
        }
        if ( dto.getJd() != null ) {
            trmPlanFormu.setJd( dto.getJd() );
        }
        if ( dto.getPxzzf() != null ) {
            trmPlanFormu.setPxzzf( dto.getPxzzf() );
        }
        if ( dto.getNd() != null ) {
            trmPlanFormu.setNd( dto.getNd() );
        }
        if ( dto.getTrmplanformuname() != null ) {
            trmPlanFormu.setTrmplanformuname( dto.getTrmplanformuname() );
        }
        if ( dto.getOrmorgid() != null ) {
            trmPlanFormu.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getPimpersonid() != null ) {
            trmPlanFormu.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            trmPlanFormu.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmPlanFormu.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getTrmplanformuid() != null ) {
            trmPlanFormu.setTrmplanformuid( dto.getTrmplanformuid() );
        }
        if ( dto.getCreatedate() != null ) {
            trmPlanFormu.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getEnable() != null ) {
            trmPlanFormu.setEnable( dto.getEnable() );
        }
        if ( dto.getCreateman() != null ) {
            trmPlanFormu.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            trmPlanFormu.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrmorgname() != null ) {
            trmPlanFormu.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getPimpersonname() != null ) {
            trmPlanFormu.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getShortname() != null ) {
            trmPlanFormu.setShortname( dto.getShortname() );
        }
        if ( dto.getZzdzs() != null ) {
            trmPlanFormu.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            trmPlanFormu.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }

        return trmPlanFormu;
    }

    @Override
    public TrmPlanFormuDTO toDto(TrmPlanFormu entity) {
        if ( entity == null ) {
            return null;
        }

        TrmPlanFormuDTO trmPlanFormuDTO = new TrmPlanFormuDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmPlanFormuDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmPlanFormuDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getBzsj() != null ) {
            trmPlanFormuDTO.setBzsj( entity.getBzsj() );
        }
        if ( entity.getJd() != null ) {
            trmPlanFormuDTO.setJd( entity.getJd() );
        }
        if ( entity.getPxzzf() != null ) {
            trmPlanFormuDTO.setPxzzf( entity.getPxzzf() );
        }
        if ( entity.getNd() != null ) {
            trmPlanFormuDTO.setNd( entity.getNd() );
        }
        if ( entity.getTrmplanformuname() != null ) {
            trmPlanFormuDTO.setTrmplanformuname( entity.getTrmplanformuname() );
        }
        if ( entity.getOrmorgid() != null ) {
            trmPlanFormuDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getPimpersonid() != null ) {
            trmPlanFormuDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            trmPlanFormuDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmPlanFormuDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getTrmplanformuid() != null ) {
            trmPlanFormuDTO.setTrmplanformuid( entity.getTrmplanformuid() );
        }
        if ( entity.getCreatedate() != null ) {
            trmPlanFormuDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getEnable() != null ) {
            trmPlanFormuDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreateman() != null ) {
            trmPlanFormuDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            trmPlanFormuDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrmorgname() != null ) {
            trmPlanFormuDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getPimpersonname() != null ) {
            trmPlanFormuDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getShortname() != null ) {
            trmPlanFormuDTO.setShortname( entity.getShortname() );
        }
        if ( entity.getZzdzs() != null ) {
            trmPlanFormuDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            trmPlanFormuDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }

        return trmPlanFormuDTO;
    }

    @Override
    public List<TrmPlanFormu> toDomain(List<TrmPlanFormuDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmPlanFormu> list = new ArrayList<TrmPlanFormu>( dtoList.size() );
        for ( TrmPlanFormuDTO trmPlanFormuDTO : dtoList ) {
            list.add( toDomain( trmPlanFormuDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmPlanFormuDTO> toDto(List<TrmPlanFormu> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmPlanFormuDTO> list = new ArrayList<TrmPlanFormuDTO>( entityList.size() );
        for ( TrmPlanFormu trmPlanFormu : entityList ) {
            list.add( toDto( trmPlanFormu ) );
        }

        return list;
    }
}

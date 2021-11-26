package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalLog;
import cn.ibizlab.ehr.webapi.dto.SalLogDTO;
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
public class SalLogMappingImpl implements SalLogMapping {

    @Override
    public SalLog toDomain(SalLogDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalLog salLog = new SalLog();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salLog.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salLog.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getVal2() != null ) {
            salLog.setVal2( dto.getVal2() );
        }
        if ( dto.getSallogname() != null ) {
            salLog.setSallogname( dto.getSallogname() );
        }
        if ( dto.getVal1() != null ) {
            salLog.setVal1( dto.getVal1() );
        }
        if ( dto.getSalsalarydetailid() != null ) {
            salLog.setSalsalarydetailid( dto.getSalsalarydetailid() );
        }
        if ( dto.getSalsalaryid() != null ) {
            salLog.setSalsalaryid( dto.getSalsalaryid() );
        }
        if ( dto.getCreateman() != null ) {
            salLog.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            salLog.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getSallogid() != null ) {
            salLog.setSallogid( dto.getSallogid() );
        }
        if ( dto.getCreatedate() != null ) {
            salLog.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            salLog.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getSalsalaryname() != null ) {
            salLog.setSalsalaryname( dto.getSalsalaryname() );
        }
        if ( dto.getSalsalarydetailname() != null ) {
            salLog.setSalsalarydetailname( dto.getSalsalarydetailname() );
        }

        return salLog;
    }

    @Override
    public SalLogDTO toDto(SalLog entity) {
        if ( entity == null ) {
            return null;
        }

        SalLogDTO salLogDTO = new SalLogDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salLogDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salLogDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getVal2() != null ) {
            salLogDTO.setVal2( entity.getVal2() );
        }
        if ( entity.getSallogname() != null ) {
            salLogDTO.setSallogname( entity.getSallogname() );
        }
        if ( entity.getVal1() != null ) {
            salLogDTO.setVal1( entity.getVal1() );
        }
        if ( entity.getSalsalarydetailid() != null ) {
            salLogDTO.setSalsalarydetailid( entity.getSalsalarydetailid() );
        }
        if ( entity.getSalsalaryid() != null ) {
            salLogDTO.setSalsalaryid( entity.getSalsalaryid() );
        }
        if ( entity.getCreateman() != null ) {
            salLogDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            salLogDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getSallogid() != null ) {
            salLogDTO.setSallogid( entity.getSallogid() );
        }
        if ( entity.getCreatedate() != null ) {
            salLogDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            salLogDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getSalsalaryname() != null ) {
            salLogDTO.setSalsalaryname( entity.getSalsalaryname() );
        }
        if ( entity.getSalsalarydetailname() != null ) {
            salLogDTO.setSalsalarydetailname( entity.getSalsalarydetailname() );
        }

        return salLogDTO;
    }

    @Override
    public List<SalLog> toDomain(List<SalLogDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalLog> list = new ArrayList<SalLog>( dtoList.size() );
        for ( SalLogDTO salLogDTO : dtoList ) {
            list.add( toDomain( salLogDTO ) );
        }

        return list;
    }

    @Override
    public List<SalLogDTO> toDto(List<SalLog> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalLogDTO> list = new ArrayList<SalLogDTO>( entityList.size() );
        for ( SalLog salLog : entityList ) {
            list.add( toDto( salLog ) );
        }

        return list;
    }
}
